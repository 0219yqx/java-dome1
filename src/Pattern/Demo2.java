package Pattern;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        // 手机号码字符串
        String s = "18512516758";
        // 编译正则表达式，匹配1开头，第二位3-9，后面9位数字的手机号码
        Pattern p = Pattern.compile("1[3-9]\\d{9}");
        // 创建匹配器
        Matcher m = p.matcher(s);
        // 执行匹配并输出结果
        System.out.println(m.matches());

        // 邮箱字符串
        String s1="boniu@itcast.cn";
        // 编译正则表达式，匹配邮箱格式
        Pattern p1=Pattern.compile("\\w+@\\w+(\\.\\w+)+");
        // 创建匹配器
        Matcher m1=p1.matcher(s1);
        // 执行匹配并输出结果
        System.out.println(m1.matches());
        String s2="010-98951256";
        // 编译正则表达式，匹配电话号码格式
        Pattern p2=Pattern.compile("0\\d{2,3}-?\\d{8}");
        // 创建匹配器
        Matcher m2=p2.matcher(s2);
        // 执行匹配并输出结果
        System.out.println(m2.matches());
    }
}
