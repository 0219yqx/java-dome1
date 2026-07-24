import java.util.Scanner;

public class rss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt(); // 行数
            int m = sc.nextInt(); // 列数

            int[][] matrix = new int[n][m];

            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};

            int x = 0, y = 0;   // 起始位置 (0,0)
            int dir = 0;        // 初始方向：0代表向右

            for (int i = 1; i <= n * m; i++) {
                matrix[x][y] = i; // 填数

                // 预测下一步的位置
                int nextX = x + dx[dir];
                int nextY = y + dy[dir];

                // 判断是否需要转向
                // 条件1：越界 (nextX < 0 或 >= n, nextY < 0 或 >= m)
                // 条件2：下一个位置已经有数字了 (matrix[nextX][nextY] != 0)
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || matrix[nextX][nextY] != 0) {
                    // 改变方向： (0+1)%4=1, (1+1)%4=2... 实现右->下->左->上->右 的循环
                    dir = (dir + 1) % 4;
                    // 更新下一步为转向后的位置
                    nextX = x + dx[dir];
                    nextY = y + dy[dir];
                }

                // 移动到下一步
                x = nextX;
                y = nextY;
            }

            // 输出矩阵
            // 格式要求：每个元素占3个位置，靠右，相邻元素相隔一个空格
            // "右对齐占3位" -> %3d
            // "相隔一个空格" -> 在 %3d 后面手动加一个空格，或者理解为总宽度是4且靠右？
            // 观察样例输出："  1   2   3" -> 1前面2空格，2前面2空格。
            // 说明格式是：[数字占3位][1个空格]
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println(); // 每行结束后换行
            }
        }

        sc.close();
    }
}
