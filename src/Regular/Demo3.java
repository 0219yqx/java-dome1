package Regular;

public class Demo3 {
    public static void main(String[] args) {
        String str1="18637336211";
        String str2="18637316825";
        String str3="134567890097";
        System.out.println(str1.matches("1[3-9]\\d{9}"));
        System.out.println(str2.matches("1[3-9]\\d{9}"));
        System.out.println(str3.matches("1[3-9]\\d{9}"));//正则表达式匹配手机号码
        String str4="020-12345678";
        String str5="021887654321";
        String str6="0210-8875432";
        System.out.println(str4.matches("0\\d{2,3}-?\\d{7,8}"));
        System.out.println(str5.matches("0\\d{2,3}-?\\d{7,8}"));
        System.out.println(str6.matches("0\\d{2,3}-?\\d{7,8}"));//正则表达式匹配电话号码
        String str7="(?i)abc";//忽略大小写
        System.out.println("abc".matches(str7));
        System.out.println("ABC".matches(str7));
        System.out.println("Abc".matches(str7));

    }
}
