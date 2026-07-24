package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {
    public static void main(String[] args) {
        String text = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                     "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台,abbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        //贪婪爬取
        String regex1="ab+";//匹配a后面跟着至少一个b的位置
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("贪婪爬取匹配到的内容："+matcher.group());
        }
        //非贪婪爬取
        String  regex2="ab+?";//匹配a后面跟着至少一个b的位置，但是尽可能少的匹配字符
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher2.find()){
            System.out.println("非贪婪爬取匹配到的内容："+matcher2.group());
        }
    }
}
