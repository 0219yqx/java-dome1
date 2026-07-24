package String;

import java.util.Scanner;

public class String13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        System.out.println("请再输入一个字符串");
        String str1 = sc.next();
        boolean flag = reverse(str, str1);
        if (flag) {
            System.out.println("字符串"+str+"可以转化为"+str1);
        } else {
            System.out.println("字符串"+str+"不可以转化为"+str1);
        }
    }
    public static boolean reverse(String str,String str1){
        String str2=str+str;//将字符串拼接
        if(str.length()==0){
            return true;
        }
        if(str.length()!=str1.length()){
            return false;
        }
        if(str2.contains(str1)){
            return true;
        }else {
            return false;
        }
    }
}
