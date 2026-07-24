package String;

import java.util.Random;
import java.util.Scanner;

public class String14 {//字符串的随机排列
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();//将字符串转换为字符数组
        for(int i = 0; i < s.length(); i++){
            Random r = new Random();
            int j = r.nextInt(i+1);
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        String str = new String(ch);
        System.out.println(str);
    }
}
