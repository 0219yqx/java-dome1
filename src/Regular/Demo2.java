package Regular;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("a".matches("."));
        System.out.println("你".matches("."));
        System.out.println("nitish".matches(".*"));//"."表示任意一个字符，"*"表示任意多个字符
        System.out.println("nitish".matches(".{5}"));//表示任意五个字符
        System.out.println("1234567890".matches("\\d{10}"));//"\\d"表示数字，"{"后面跟的是重复的次数
        System.out.println("1234567890".matches("\\d{1,}"));//表示至少有一个数字
        System.out.println("1234567890".matches("\\d{1,10}"));//表示有1到10个数字
        System.out.println("z".matches("\\w"));//"\\w"表示任意一个字母或数字a-z或A-Z或0-9或_
        System.out.println("你".matches("\\w"));
        System.out.println("你".matches("\\W"));//"\\W"表示任意一个非字母或数字a-z或A-Z或0-9或_
        System.out.println("你".matches("\\s"));//"\\s"表示任意一个空白字符
        System.out.println("你".matches("\\S"));//"\\S"表示任意一个非空白字符
        System.out.println("你".matches("\\D"));//"\\D"表示任意一个非数字
        System.out.println("你".matches("[abc]"));//"[abc]"表示a或b或c中的一个字符
    }
}
