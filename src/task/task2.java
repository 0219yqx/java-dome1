package task;

public class task2 {

    public static void dijkstra(int[][] graph, int source) {
        int V = graph.length; // 顶点个数

        // （2）初始化参数
        int[] dist = new int[V];         // 距离数组：记录源点到各顶点的当前最短距离
        boolean[] visited = new boolean[V]; // 标记数组：标记顶点是否已确定最短路径
        int[] prev = new int[V];         // 路径数组：记录各顶点最短路径的前驱顶点

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE; // 初始距离设为无穷大
            prev[i] = -1;                // 初始前驱设为 -1
            visited[i] = false;          // 初始标记为未确定
        }
        dist[source] = 0;                // 源点到自身的距离为 0

        // （3）执行贪心选择与更新：迭代 V-1 次，每次确定一个顶点的最短路径
        for (int count = 0; count < V - 1; count++) {

            // 【贪心选择】：在未确定最短路径的顶点中，寻找当前距离最小的顶点 u
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }

            // 如果剩下的顶点不可达，则提前结束
            if (u == -1) {
                break;
            }

            // 将选出的顶点 u 标记为已确定（贪心选择的顶点，其最短路径就此确定）
            visited[u] = true;

            // 【最优子结构】：利用已确定的最短路径，更新其邻接点的距离
            // 如果经过 u 到达 v 的距离比原先记录的 dist[v] 更短，则更新
            for (int v = 0; v < V; v++) {
                // 条件：v 未被访问，u 到 v 有边，且 dist[u] 不是无穷大（防溢出）
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE) {
                    int newDist = dist[u] + graph[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;  // 更新最短距离
                        prev[v] = u;        // 更新前驱节点为 u
                    }
                }
            }
        }

        // （4）输出结果：打印源点到各顶点的最短距离及具体路径
        System.out.println("源点 " + source + " 到各顶点的最短路径：");
        System.out.println("顶点\t最短距离\t路径");
        for (int i = 0; i < V; i++) {
            if (i == source) {
                System.out.println(i + "\t" + 0 + "\t\t" + i);
            } else if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + "\t不可达\t\t无");
            } else {
                System.out.print(i + "\t" + dist[i] + "\t\t");
                printPath(prev, i);
                System.out.println();
            }
        }
    }

    // 辅助方法：利用 prev 数组回溯并打印具体路径
    private static void printPath(int[] prev, int target) {
        // 用递归从终点向前回溯到源点，然后依次输出
        if (prev[target] != -1) {
            printPath(prev, prev[target]);
        }
        System.out.print(target + (prev[target] == -1 ? "" : " -> "));
    }

    public static void main(String[] args) {
        // （1）构建图模型：用邻接矩阵表示有向图
        // graph[i][j] 表示从顶点 i 到顶点 j 的边权值，0 表示没有直接相连的边
        int[][] graph = {
            // 0  1  2  3  4
            { 0, 4, 1, 0, 0 }, // 0 -> 1(4), 0 -> 2(1)
            { 0, 0, 0, 1, 0 }, // 1 -> 3(1)
            { 0, 1, 0, 5, 0 }, // 2 -> 1(1), 2 -> 3(5)
            { 0, 0, 0, 0, 2 }, // 3 -> 4(2)
            { 0, 0, 0, 0, 0 }  // 4
        };

        int source = 0; // 设定源点为 0
        dijkstra(graph, source);
    }
}

