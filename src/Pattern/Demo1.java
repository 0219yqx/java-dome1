package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        //验证电话号
        // 编译正则表达式：匹配3位数字-4位数字-4位数字的格式
        Pattern pattern = Pattern.compile("(\\d{3})-(\\d{4})-(\\d{4})");
        // 创建匹配器，使用测试字符串
        Matcher matcher = pattern.matcher("123-4567-8901");
        // 查找匹配项
//        验证格式：用 matches()（检查整个字符串）方法，而不是 find()（查找匹配项）
//         查找子串：用 find()（在字符串中寻找匹配部分）方法，而不是 matches()（检查整个字符串）
        if (matcher.find()) {
            // 输出完整匹配的字符串
            System.out.println(matcher.group());
            // 输出第一个捕获组（前3位数字）
            System.out.println(matcher.group(1));
            // 输出第二个捕获组（中间4位数字）
            System.out.println(matcher.group(2));
            // 输出第三个捕获组（后4位数字）
            System.out.println(matcher.group(3));
        }
    }
}
