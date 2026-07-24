package task;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数塔的层数: ");
        int n = scanner.nextInt();

        int[][] tower = new int[n][n];
        System.out.println("请输入数塔的各层数字（从顶层到底层，每层从左到右输入）:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tower[i][j] = scanner.nextInt();
            }
        }

        // 动态规划求解
        int result = findMaxPathSum(tower, n);
        System.out.println("从塔顶到塔底的最大路径和为: " + result);

        scanner.close();
    }

    /**
     * 使用动态规划求解数塔最大路径和
     * @param tower 数塔二维数组
     * @param n 数塔层数
     * @return 最大路径和
     */
    public static int findMaxPathSum(int[][] tower, int n) {
        // 状态定义：dp[i][j] 表示从第 i 行第 j 列的节点到达底部的最大路径和
        int[][] dp = new int[n][n];

        // 边界条件处理：将最底层的节点值直接赋给 dp 数组
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = tower[n - 1][j];
        }

        // 自底向上递推：从倒数第二层开始，逐层向上计算
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                // 状态转移方程：当前节点的最大和 = 当前节点值 + 下方和右下方节点中较大的路径和
                dp[i][j] = tower[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        // 塔顶元素即为从塔顶到塔底的最大路径和
        return dp[0][0];
    }
}
