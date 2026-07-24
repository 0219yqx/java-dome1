package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        // （1）定义面额数组：按从大到小排序（规范币值体系）
        int[] denominations = {100, 50, 20, 10, 5, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入待找零金额: ");
        int amount = scanner.nextInt();

        // 处理非法输入
        if (amount < 0) {
            System.out.println("找零金额不能为负数。");
            return;
        }

        // （2）初始化剩余金额与记录列表
        int remainingAmount = amount;
        List<Integer> result = new ArrayList<>();

        // （3）执行贪心选择：遍历面额，每次尽可能多地选取最大面额
        for (int coin : denominations) {
            while (remainingAmount >= coin) {
                result.add(coin);
                remainingAmount -= coin;
            }
            // 提前结束，提高效率
            if (remainingAmount == 0) {
                break;
            }
        }

        // （4）输出结果
        // 在规范币值体系下，只要有1元面额，remainingAmount最终必为0。若面额体系中无1元，可能出现无法找零。
        if (remainingAmount > 0) {
            System.out.println("当前面额组合无法完成找零 " + amount + " 元。");
        } else {
            System.out.println("找零 " + amount + " 元的最少纸币组合为: " + result);
            System.out.println("总张数: " + result.size() + " 张");
        }

        scanner.close();
    }
}

