package String;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字：");
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }
        String moneyStr = "";
        //得到money的每一位
        int count = 0;
        int digitPosition = 0;
        while (true) {
            int ge = money % 10;
            money = money / 10;
            count++;
            String capital = getBigNumber(ge);
            String unit = getUnit(digitPosition);
            digitPosition++;
            moneyStr = capital + unit + moneyStr;
            if (money == 0) {
                break;
            }
        }
        for (int i = 0; i < 8 - count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
    }

    public static String getBigNumber(int money) {
        String[] big = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return big[money];
    }

    public static String getUnit(int digitPosition) {
        String[] unit = {"元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿"};
        return unit[digitPosition];
    }
}