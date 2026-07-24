package String;

import java.util.Random;
import java.util.Scanner;

public class String15 {//生成验证码

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("请输入验证码的个数");
        for(int i = 0; i < count; i++){
            String checkCode = getCheckCode(6);
            System.out.println(checkCode);
        }
    }
    public static String getCheckCode(int n){
        String str="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int index = r.nextInt(str.length());//随机生成索引
            char ch = str.charAt(index);//根据索引找字符
            sb.append(ch);
        }
        return sb.toString();//将StringBuilder转换为String
    }
}
