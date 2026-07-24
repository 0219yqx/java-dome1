package task;

import java.util.Arrays;

public class task6 {

    /**
     * 使用动态规划求解最长递增子序列长度
     * @param nums 给定的整数序列
     * @return 最长递增子序列的长度
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        // （1）初始化 dp 数组，dp[i] 表示以 nums[i] 结尾的最长递增子序列长度，初始值均为1
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLength = 1; // 记录全局最大长度

        // （2）遍历序列
        for (int i = 0; i < n; i++) {
            // 对于每个元素 i，再遍历其之前的所有元素 j
            for (int j = 0; j < i; j++) {
                // 若 nums[j] < nums[i]，说明可以将 nums[i] 接在以 nums[j] 结尾的子序列后面
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // （3）实时更新最大长度（相当于最后遍历 dp 数组找最大值）
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // （4）编写程序实现，使用多个测试用例验证结果

        // 测试用例1：普通无序序列
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("序列 " + Arrays.toString(nums1) + " 的最长递增子序列长度为: " + lengthOfLIS(nums1));
        // 预期输出: 4 (子序列为 [2,3,7,101] 或 [2,5,7,101] 等)

        // 测试用例2：含重复元素的序列
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println("序列 " + Arrays.toString(nums2) + " 的最长递增子序列长度为: " + lengthOfLIS(nums2));
        // 预期输出: 4 (子序列为 [0,1,2,3])

        // 测试用例3：完全递减序列
        int[] nums3 = {7, 5, 4, 3, 1};
        System.out.println("序列 " + Arrays.toString(nums3) + " 的最长递增子序列长度为: " + lengthOfLIS(nums3));
        // 预期输出: 1 (每个元素自身构成长度为1的子序列)

        // 测试用例4：完全递增序列
        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println("序列 " + Arrays.toString(nums4) + " 的最长递增子序列长度为: " + lengthOfLIS(nums4));
        // 预期输出: 5 (子序列为整个序列)
    }
}

