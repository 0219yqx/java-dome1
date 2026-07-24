package ceshi;

import java.util.Scanner;

public class text2 {//判断一个字符串是否是回文字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result=new StringBuilder(str).reverse().toString();
        if(str.equals(result)){
            System.out.println("YES,回文字符为："+result);
        }else{
            System.out.println("NO,回文字符为："+result);
        }

    }


}
