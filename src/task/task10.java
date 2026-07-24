package task;
import java.util.*;

public class task10 {

    // 物品类
    static class Item {
        int id;
        int w;
        int v;
        public Item(int id, int w, int v) {
            this.id = id;
            this.w = w;
            this.v = v;
        }
    }

    // 解空间树节点类
    static class Node implements Comparable<Node> {
        int index;      // 当前正在决策的物品索引（在排序后的数组中）
        int cw;         // 当前重量
        int cv;         // 当前价值
        double ub;      // 上界价值
        List<Integer> path; // 决策路径（保存物品原始ID）

        public Node(int index, int cw, int cv, double ub, List<Integer> path) {
            this.index = index;
            this.cw = cw;
            this.cv = cv;
            this.ub = ub;
            this.path = new ArrayList<>(path);
        }

        // 优先队列按 ub 从大到小排序
        @Override
        public int compareTo(Node o) {
            return Double.compare(o.ub, this.ub);
        }
    }

    // 计算上界函数
    private static double bound(int index, int cw, int cv, int C, Item[] items) {
        double ub = cv;
        int remainingCapacity = C - cw;
        int i = index;
        // 尽可能按单位价值降序装入剩余物品
        while (i < items.length && items[i].w <= remainingCapacity) {
            remainingCapacity -= items[i].w;
            ub += items[i].v;
            i++;
        }
        // 如果还有剩余容量，按比例装入部分物品（分数背包思想计算上界）
        if (i < items.length && remainingCapacity > 0) {
            ub += (double) items[i].v / items[i].w * remainingCapacity;
        }
        return ub;
    }

    public static void solve(int C, Item[] items) {
        // 预处理：按单位重量价值降序排序
        Arrays.sort(items, (a, b) -> Double.compare((double)b.v/b.w, (double)a.v/a.w));

        // 优先队列
        PriorityQueue<Node> pq = new PriorityQueue<>();
        List<Integer> initialPath = new ArrayList<>();

        // 创建根节点
        Node root = new Node(0, 0, 0, bound(0, 0, 0, C, items), initialPath);
        pq.add(root);

        int bestValue = 0;
        List<Integer> bestPath = new ArrayList<>();

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            // 如果是叶子节点，说明找到了最优解（由于是优先队列，第一个出队的叶子必为全局最优）
            if (node.index == items.length) {
                bestValue = node.cv;
                bestPath = node.path;
                break;
            }

            Item currentItem = items[node.index];

            // 1. 左子树：装入当前物品
            if (node.cw + currentItem.w <= C) {
                List<Integer> leftPath = new ArrayList<>(node.path);
                leftPath.add(currentItem.id);
                double leftUb = bound(node.index + 1, node.cw + currentItem.w, node.cv + currentItem.v, C, items);

                // 最优性剪枝：若上界大于当前最优值，才入队
                if (leftUb > bestValue) {
                    Node leftNode = new Node(node.index + 1, node.cw + currentItem.w, node.cv + currentItem.v, leftUb, leftPath);
                    pq.add(leftNode);
                    // 更新最优值（实时更新，用于后续剪枝）
                    if (leftNode.cv > bestValue) {
                        bestValue = leftNode.cv;
                    }
                }
            }

            // 2. 右子树：不装入当前物品
            double rightUb = bound(node.index + 1, node.cw, node.cv, C, items);
            // 最优性剪枝
            if (rightUb > bestValue) {
                List<Integer> rightPath = new ArrayList<>(node.path);
                Node rightNode = new Node(node.index + 1, node.cw, node.cv, rightUb, rightPath);
                pq.add(rightNode);
            }
        }

        // 输出结果
        System.out.println("最大总价值为: " + bestValue);
        System.out.println("选择的物品编号为: " + bestPath);
    }

    public static void main(String[] args) {
        int C = 10;
        Item[] items = {
            new Item(1, 4, 40), // 帐篷
            new Item(2, 5, 25), // 食物
            new Item(3, 2, 20), // 水壶
            new Item(4, 1, 10)  // 急救包
        };
        System.out.println("背包容量: " + C + "kg");
        solve(C, items);
    }
}


