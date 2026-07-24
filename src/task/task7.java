package task;

public class task7 {

    /**
     * 方法一：标准二维动态规划
     * @param w 物品重量数组
     * @param v 物品价值数组
     * @param C 背包最大承重
     * @return 最大总价值
     */
    public static int knapsack2D(int[] w, int[] v, int C) {
        int n = w.length;
        // （1）定义二维数组 dp[i][c]，i表示前i件物品，c表示承重
        // 数组大小为 (n+1) x (C+1)，便于处理边界条件
        int[][] dp = new int[n + 1][C + 1];

        // （2）初始化边界：i=0 或 c=0 时，dp值默认为0，Java数组自动初始化为0，故无需显式赋值

        // （3）遍历物品和承重，填充 dp 数组
        for (int i = 1; i <= n; i++) {
            for (int c = 1; c <= C; c++) {
                // 注意：物品索引从0开始，所以第i件物品的重量是 w[i-1]，价值是 v[i-1]
                if (w[i - 1] > c) {
                    // 物品超重，不能放入背包
                    dp[i][c] = dp[i - 1][c];
                } else {
                    // 状态转移方程：比较“不放入当前物品”和“放入当前物品”的价值
                    dp[i][c] = Math.max(dp[i - 1][c], dp[i - 1][c - w[i - 1]] + v[i - 1]);
                }
            }
        }

        // （4）dp[n][C] 即为所求的最大总价值
        return dp[n][C];
    }

    /**
     * 方法二：空间优化版（一维滚动数组）
     * @param w 物品重量数组
     * @param v 物品价值数组
     * @param C 背包最大承重
     * @return 最大总价值
     */
    public static int knapsack1D(int[] w, int[] v, int C) {
        int n = w.length;
        // 优化空间复杂度：将二维数组压缩为一维数组
        int[] dp = new int[C + 1];

        // 遍历每件物品
        for (int i = 1; i <= n; i++) {
            // 【关键点】：承重 c 必须逆序遍历！
            // 因为 dp[c - w[i-1]] 需要使用的是上一层 (i-1) 的旧值。
            // 如果正序遍历，dp[c - w[i-1]] 可能已经被当前物品更新过，导致同一件物品被多次放入（变成完全背包问题）。
            for (int c = C; c >= w[i - 1]; c--) {
                dp[c] = Math.max(dp[c], dp[c - w[i - 1]] + v[i - 1]);
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        // 测试用例
        int[] w = {2, 3, 4, 5}; // 物品重量
        int[] v = {3, 4, 5, 6}; // 物品价值
        int C = 8;              // 背包最大承重

        System.out.println("物品重量: {2, 3, 4, 5}");
        System.out.println("物品价值: {3, 4, 5, 6}");
        System.out.println("背包最大承重: " + C);

        int maxValue2D = knapsack2D(w, v, C);
        System.out.println("二维动态规划求得的最大价值: " + maxValue2D);

        int maxValue1D = knapsack1D(w, v, C);
        System.out.println("一维滚动数组求得的最大价值: " + maxValue1D);
    }
}

