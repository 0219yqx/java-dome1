package String;

public class String9 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.reverse();
        int len=sb.length();
        String str=sb.toString();
        String str1= sb.substring(0,1);
        System.out.println(len);
        System.out.println(sb);
        System.out.println(str);
        System.out.println(str1);
    }
}
