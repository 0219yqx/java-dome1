package task;

import java.util.Scanner;

public class task8 {

    private static int count = 0; // 记录合法方案的总数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入皇后数量 N: ");
        int n = scanner.nextInt();

        // （1）定义存储皇后位置的数组
        // queens[i] = j 表示第 i 行的皇后放置在第 j 列
        int[] queens = new int[n];

        System.out.println("N = " + n + " 时的合法放置方案如下：");

        // （2）从第 0 行开始执行回溯
        backtrack(0, n, queens);

        System.out.println("-----------------------------");
        System.out.println("总共有 " + count + " 种不同的放置方案。");

        scanner.close();
    }

    /**
     * 回溯核心函数
     * @param row 当前正在处理的行数
     * @param n   皇后总数
     * @param queens 记录皇后位置的数组
     */
    private static void backtrack(int row, int n, int[] queens) {
        // 终止条件：若当前行数等于 N，说明成功放置了 N 个皇后，找到一个解
        if (row == n) {
            count++;
            printSolution(queens);
            return;
        }

        // 遍历当前行的每一列，尝试放置皇后
        for (int col = 0; col < n; col++) {
            // 判断该位置是否与已放置的皇后冲突（剪枝操作）
            if (isValid(row, col, queens)) {
                // 做出选择：在此处放置皇后
                queens[row] = col;

                // 递归进入下一行
                backtrack(row + 1, n, queens);

                // 回溯：撤销选择（由于下一次循环会覆盖 queens[row] 的值，此处可省略显式重置）
                // queens[row] = -1;
            }
        }
    }

    /**
     * 检查在 (row, col) 位置放置皇后是否合法
     * @param row 当前行
     * @param col 当前列
     * @param queens 已放置皇后的位置数组
     * @return 合法返回 true，冲突返回 false
     */
    private static boolean isValid(int row, int col, int[] queens) {
        // 遍历之前已经放置了皇后的每一行
        for (int i = 0; i < row; i++) {
            // 1. 列冲突：如果之前某行的皇后也在 col 列
            // 2. 斜向冲突：如果行差绝对值等于列差绝对值，说明在同一斜线上
            if (queens[i] == col || Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 格式化打印具体的放置方案
     * @param queens 皇后位置数组
     */
    private static void printSolution(int[] queens) {
        int n = queens.length;
        System.out.println("方案 " + count + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
