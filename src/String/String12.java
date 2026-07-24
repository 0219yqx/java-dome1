package String;

import java.util.Scanner;

public class String12 {//判断字符串是否为数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = checkStr(str);
        if (flag) {
            System.out.println("是数字");

        } else {
            System.out.println("不是数字");
        }
        for(int i = 0; i < str.length(); i++) {
            System.out.print(checkStr1(str.charAt(i) - '0') + " ");//将字符转换为数字
        }
    }
    public static boolean checkStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {//判断字符是否为数字
                return false;
            }
        }
        return true;
    }
    public static String checkStr1(int number) {
        String[]arr={"零","一","二","三","四","五","六","七","八","九"};
        return arr[number];
    }
}
