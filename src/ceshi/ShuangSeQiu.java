package ceshi;

import java.util.Random;
import java.util.Scanner;

public class ShuangSeQiu {
    public static void main(String[] args) {
        System.out.println("请输入您的号码：");
        int[] number = getNumber();
        System.out.println("您输入的号码为：");
        printNumber(number);
        System.out.println();
        System.out.println("开奖号码为：");
        int[] superNumber = getSuperNumber();
        printNumber(superNumber);
        System.out.println();
        compareNumber(number, superNumber);


    }

    public static int[] getNumber() {

        int[] number = new int[7];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            number[i] = input.nextInt();
            if (number[i] > 33 || number[i] < 1) {
                System.out.println("输入有误，请重新输入");
            }
        }

        number[6] = input.nextInt();
        if (number[6] > 16 || number[6] < 1) {
            System.out.println("输入有误，请重新输入");
        }
        return number;
    }
    public static int[] getSuperNumber(){
        int[] superNumber = new int[7];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            superNumber[i] = random.nextInt(33) + 1;
            boolean flag = true;
            for(int j = 0;j < i;j++){
                if(superNumber[i] == superNumber[j]){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                superNumber[i]= random.nextInt(33) + 1;
                i++;
            }
        }
        superNumber[6] = random.nextInt(16) + 1;
        return superNumber;
    }
    public static void printNumber(int[] number){
        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
    }
    public static void compareNumber(int[] number,int[] superNumber) {
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (number[i] == superNumber[i]) {
                    redCount++;
                    break;
                }
            }
        }
        if (number[6] == superNumber[6]) {
            blueCount=1;
        }
        System.out.println("红球中" + redCount + "个，蓝球中" + blueCount + "个");

        System.out.println();

        // 判断中奖等级
        if (redCount == 6 && blueCount == 1) {
            System.out.println("★★★ 恭喜您中得【一等奖】！★★★");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("★★ 恭喜您中得【二等奖】！★★");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("★ 恭喜您中得【三等奖】！★");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜您中得【四等奖】！");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜您中得【五等奖】！");
        } else if (blueCount == 1) {  // 只中蓝球也是六等奖
            System.out.println("恭喜您中得【六等奖】！");
        } else {
            System.out.println("很遗憾，没有中奖，再接再厉！");
        }
    }

}