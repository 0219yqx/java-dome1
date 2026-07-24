package String;
import java.util.Random;
import java.util.Scanner;

public class String16 {//验证码长度：5位
/*长度：5位
内容：4个字母 + 1个数字
数字位置：可以是任意位置（第1位、第2位等）*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("请输入验证码的个数");
        for(int i = 0; i < count; i++){
            String checkCode = getCheckCode(5);
            System.out.println(checkCode);
        }
    }
    public static String getCheckCode(int n){
        String letter="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number="0123456789";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int index = r.nextInt(5);
        for(int i = 0; i < 5; i++) {
            if(i==index){
                int num = r.nextInt(number.length());
                char ch = number.charAt(num);
                sb.append(ch);
            }else{
                int num = r.nextInt(letter.length());
                char ch = letter.charAt(num);
                sb.append(ch);

            }
        }
        return sb.toString();
    }
}
