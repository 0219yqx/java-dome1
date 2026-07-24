package Pattern;

public class Demo8 {
    public static void main(String[] args) {
        String test="我想想想睡睡睡睡睡觉觉觉";
        String result=test.replaceAll("(.)\\1*","$1");//正则表达式匹配重复的字符，并把重复的字符替换为单个字符
        System.out.println(result);
    }
}
//replacall方法：替换字符串中所有匹配给定正则表达式的子串