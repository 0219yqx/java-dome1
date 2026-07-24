package String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("请输入一串字符串：");
        int smartcount=0;
        int bigcount=0;
        int numbercount=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='a'&&c<='z'){
               smartcount++;
            }else if(c>='A'&&c<='Z'){
                bigcount++;
            }else if(c>='0'&&c<='9') {
                numbercount++;
            }



        }
        System.out.println("大写字母有"+bigcount+"个");
        System.out.println("小写字母有"+smartcount+"个");
        System.out.println("数字有"+numbercount+"个");
    }
}
