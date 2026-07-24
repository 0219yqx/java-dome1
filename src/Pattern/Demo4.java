package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
    public static void main(String[] args) {
        String text = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                     "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex1="((?i)Java)(?=8|11|17)";//正向先行断言，匹配Java后面跟着8或者11或者17的位置
        //？理解为前面的数据Java
        //=理解为前面的数据要和后面的数据匹配，但是不消耗字符
        //?=理解为后面的数据8或者11或者17
        //i理解为忽略大小写
        String regex2="((?i)Java)(?!8|11|17)";//负向先行断言，匹配Java后面不跟着8或者11或者17的位置
        String regex3="((?i)Java)(?:8|11|17)";//非捕获组，匹配Java后面跟着8或者11或者17的位置
        Pattern pattern = Pattern.compile(regex3);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("匹配到的内容："+matcher.group());
        }
    }
}
