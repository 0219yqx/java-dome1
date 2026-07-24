package task;

import java.util.Scanner;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数 N: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("N 必须为正整数。");
            return;
        }

        // N为奇数且大于1时，奇数和偶数的数量不等，无法相间排列，必定存在两个奇数或两个偶数相邻
        // 两个奇数或偶数之和为偶数且大于2，必然不是素数，故直接无解
        if (n > 1 && n % 2 != 0) {
            System.out.println("N = " + n + " 时无合法的素数环方案。");
            return;
        }

        // （1）预处理：生成不大于 2N 的素数表（埃氏筛法）
        // 两数之和最大为 N + (N-1) < 2N
        boolean[] isPrime = sieveOfEratosthenes(2 * n);

        // （2）定义存储当前环的数组和标记数字使用状态的数组
        int[] ring = new int[n];
        boolean[] used = new boolean[n + 1]; // 索引 1 到 N 表示对应数字是否已使用

        // 优化：固定第一个数字为1，利用环的旋转对称性避免重复计算
        ring[0] = 1;
        used[1] = true;

        int count = 0;
        System.out.println("N = " + n + " 时的素数环方案如下：");

        // （3）设计递归函数，从第 2 个位置（索引为1）开始尝试填充
        count = backtrack(1, n, ring, used, isPrime, 0);

        System.out.println("-----------------------------");
        System.out.println("总共有 " + count + " 种不同的素数环方案。");

        scanner.close();
    }

    /**
     * 埃氏筛法生成素数表
     */
    private static boolean[] sieveOfEratosthenes(int maxNum) {
        boolean[] isPrime = new boolean[maxNum + 1];
        for (int i = 2; i <= maxNum; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= maxNum; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    /**
     * 回溯核心函数
     * @param index 当前正在填充的环的位置（索引）
     * @param n     环的总长度
     * @param ring  当前环的数组
     * @param used  数字使用状态数组
     * @param isPrime 素数表
     * @param count  当前找到的方案数
     * @return 总方案数
     */
    private static int backtrack(int index, int n, int[] ring, boolean[] used, boolean[] isPrime, int count) {
        // 终止条件：环的长度等于 N
        if (index == n) {
            // 检查首尾数字之和是否为素数
            if (isPrime[ring[n - 1] + ring[0]]) {
                count++;
                printRing(ring, count);
            }
            return count;
        }

        // 遍历 2 到 N 的数字尝试放入环中
        for (int i = 2; i <= n; i++) {
            // 剪枝：如果该数字未使用，且与前一个数字之和为素数
            if (!used[i] && isPrime[ring[index - 1] + i]) {
                // 做出选择：标记并加入环中
                used[i] = true;
                ring[index] = i;

                // 递归处理下一个位置
                count = backtrack(index + 1, n, ring, used, isPrime, count);

                // 回溯：撤销选择
                used[i] = false;
                // ring[index] 的值会在下次循环被覆盖，无需显式重置
            }
        }
        return count;
    }

    /**
     * 打印素数环方案
     */
    private static void printRing(int[] ring, int count) {
        System.out.print("方案 " + count + ": ");
        for (int i = 0; i < ring.length; i++) {
            System.out.print(ring[i] + (i == ring.length - 1 ? "" : " -> "));
        }
        // 首尾相接提示
        System.out.println(" -> (回到 " + ring[0] + ")");
    }
}



