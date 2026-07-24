package IO;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IOText1 {
    static final String FAMILY_URL = "https://m.diyifanwen.com/tool/baijiaxing/";
    static final String NAME_URL = "https://qimingm.hao86.com/view/247752/";

    // 编码：先 UTF-8，打印乱码就改 "GBK"
    static final String CHARSET = "UTF-8";

    // ★ 两个正则（刚从源码里推出来的）
    static final String FAMILY_REGEX = "target=\"_blank\">([\\u4e00-\\u9fa5])</a>";
    static final String NAME_REGEX = "\\(\\d+\\)([\\u4e00-\\u9fa5])";

    public static void main(String[] args) throws Exception {
        String familyHtml = readHtml(FAMILY_URL);
        saveHtml("html_family.html", familyHtml);
        String nameHtml = readHtml(NAME_URL);
        saveHtml("html_name.html", nameHtml);
        List<String> family = extract(familyHtml, FAMILY_REGEX);
        List<String> names = extract(nameHtml, NAME_REGEX);
        System.out.println("姓池(" + family.size() + "个) 前20="
                + family.subList(0, Math.min(20, family.size())));
        System.out.println("名池(" + names.size() + "个) 前20="
                + names.subList(0, Math.min(20, names.size())));
        if (family.isEmpty() || names.isEmpty()) {
            System.out.println("提取失败，请检查正则表达式是否正确");
            return;
        }
        Random r = new Random();
        Set<String> set = new LinkedHashSet<>();
        while (set.size() < 20) {
            String xing = family.get(r.nextInt(family.size()));
            String ming = names.get(r.nextInt(names.size()));
            set.add(xing + ming);   // 重名自动被Set拒收
        }
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("name.txt"), CHARSET))) {
            for (String s : set) {
                bw.write(s + "\n");
            }
        }
          System.out.println("20个姓名：" + set);
        System.out.println("已写入 name.txt ✅");
    }
        private static String readHtml (String urlStr) throws Exception {
            URLConnection c = new URL(urlStr).openConnection();
            c.setRequestProperty("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/120.0 Safari/537.36");
            c.setConnectTimeout(5000);
            c.setReadTimeout(5000);
            StringBuilder sb = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream(), CHARSET))) {
                String line;
                while ((line = in.readLine()) != null) {
                    sb.append(line).append("\n");// 拼接每一行
                }
            }
            return sb.toString();
        }
        private static void saveHtml (String fileName, String html) throws Exception {
            try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
                out.write(html);
            }
        }
        private static List<String> extract (String html, String regex){
            List<String> list = new ArrayList<>();
            Matcher m = Pattern.compile(regex).matcher(html);
            while (m.find()) {
                list.add(m.group(1));// ★ 只取第一个括号的内容

            }
            return list;
        }
    }
