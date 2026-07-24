package heima;

import java.util.Random;
import java.util.Scanner;

public class hj8 {//双色球系统
    public static void main(String[] args) {
        System.out.println("======= 欢迎使用双色球系统 =======");
        int[] arr1 = getBoll();
        System.out.println("\n你购买的号码为：");
        printBalls(arr1);

        System.out.println("\n正在开奖...");
        int[] arr = CreatBoll();
        System.out.println("中奖号码为：");
        printBalls(arr);

        System.out.println("\n======= 开奖结果 =======");
        getNumber(arr1, arr);
    }

    // 生成中奖号码
    public static int[] CreatBoll() {
        Random random = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            int number = random.nextInt(33) + 1;
            boolean flag = ComputerBoll(arr, number);
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
        arr[6] = random.nextInt(16) + 1;
        return arr;
    }

    // 检查号码是否已存在
    public static boolean ComputerBoll(int arr[], int number) {
        for (int i = 0; i < 6; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    // 获取用户购买的号码
    public static int[] getBoll() {
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入6个红球号码（1-33，不能重复）：");
        for (int i = 0; i < 6; ) {
            System.out.print("请输入第" + (i + 1) + "个红球号码：");

            // 检查输入是否为整数
            if (!scanner.hasNextInt()) {
                System.out.println("输入错误，请输入数字！");
                scanner.next(); // 清除无效输入
                continue;
            }

            int number = scanner.nextInt();
            if (number < 1 || number > 33) {
                System.out.println("输入错误，红球号码范围是1-33，请重新输入！");
            } else {
                boolean flag = ComputerBoll(arr, number);
                if (!flag) {
                    arr[i] = number;
                    i++;
                } else {
                    System.out.println("输入重复，请重新输入！");
                }
            }
        }

        System.out.println("\n请输入1个蓝球号码（1-16）：");
        while (true) {
            System.out.print("请输入蓝球号码：");

            // 检查输入是否为整数
            if (!scanner.hasNextInt()) {
                System.out.println("输入错误，请输入数字！");
                scanner.next(); // 清除无效输入
                continue;
            }

            int number = scanner.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("输入错误，蓝球号码范围是1-16，请重新输入！");
            } else {
                arr[6] = number;
                break;
            }
        }

        return arr;
    }

    // 打印号码（红球和蓝球分开显示）
    public static void printBalls(int[] arr) {
        System.out.print("红球：");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%02d ", arr[i]);
        }
        System.out.print("  蓝球：");
        System.out.printf("%02d\n", arr[6]);
    }

    // 判断中奖情况
    public static void getNumber(int arr2[], int arr1[]) {
        int getRedCount = 0;
        boolean isBlueWin = false;

        // 统计红球中奖个数
        for (int i = 0; i < 6; i++) {
            int getredNumber = arr2[i];
            for (int j = 0; j < 6; j++) {
                if (getredNumber == arr1[j]) {
                    getRedCount++;
                    break;
                }
            }
        }

        // 判断蓝球是否中奖
        if (arr2[6] == arr1[6]) {
            isBlueWin = true;
        }

        System.out.println("红球中奖个数：" + getRedCount + "个");
        System.out.println("蓝球是否中奖：" + (isBlueWin ? "是" : "否"));
        System.out.println();

        // 判断奖项
        if (getRedCount == 6 && isBlueWin) {
            System.out.println("★★★ 恭喜您中了一等奖！★★★");
        } else if (getRedCount == 6 && !isBlueWin) {
            System.out.println("★★ 恭喜您中了二等奖！★★");
        } else if (getRedCount == 5 && isBlueWin) {
            System.out.println("★ 恭喜您中了三等奖！★");
        } else if ((getRedCount == 5 && !isBlueWin) || (getRedCount == 4 && isBlueWin)) {
            System.out.println("恭喜您中了四等奖！");
        } else if ((getRedCount == 4 && !isBlueWin) || (getRedCount == 3 && isBlueWin)) {
            System.out.println("恭喜您中了五等奖！");
        } else if (isBlueWin) {
            System.out.println("恭喜您中了六等奖！");
        } else {
            System.out.println("很遗憾，没有中奖，再接再厉！");
        }
    }
}