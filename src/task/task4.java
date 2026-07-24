package task;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// 霍夫曼树节点类
class HuffmanNode implements Comparable<HuffmanNode> {
    char ch;          // 字符
    int freq;         // 频率（权重）
    HuffmanNode left; // 左子节点
    HuffmanNode right;// 右子节点

    // 叶子节点构造器
    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }

    // 内部节点构造器（无字符）
    HuffmanNode(int freq, HuffmanNode left, HuffmanNode right) {
        this.ch = '\0';
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    // 按频率从小到大排序，便于优先队列（最小堆）使用
    @Override
    public int compareTo(HuffmanNode other) {
        return this.freq - other.freq;
    }
}

public class task4 {

    // （3）生成编码：从根节点出发，左分支记为0，右分支记为1
    public static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) return;

        // 如果是叶子节点，保存该字符的编码
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.ch, code);
            return;
        }

        generateCodes(root.left, code + "0", huffmanCodes);
        generateCodes(root.right, code + "1", huffmanCodes);
    }

    public static void main(String[] args) {
        // （1）输入字符及频率
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] freqs = {45, 13, 12, 16, 9, 5};

        // （2）构建霍夫曼树：放入最小堆（优先队列）
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }

        // 贪心选择与合并
        while (pq.size() > 1) {
            // 提取两个频率最小的节点
            HuffmanNode a = pq.poll();
            HuffmanNode b = pq.poll();
            // 新建父节点，权重为两节点权重之和
            HuffmanNode parent = new HuffmanNode(a.freq + b.freq, a, b);
            // 将父节点插入堆中
            pq.add(parent);
        }

        // 堆中最后剩下的节点即为霍夫曼树的根节点
        HuffmanNode root = pq.poll();

        // 生成编码字典
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(root, "", huffmanCodes);

        // （4）（5）计算总编码长度并输出结果
        int totalLength = 0;
        System.out.println("字符\t频率\t编码");
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int freq = freqs[i];
            String code = huffmanCodes.get(c);
            System.out.println(c + "\t" + freq + "\t" + code);
            totalLength += freq * code.length();
        }

        System.out.println("-----------------------------");
        System.out.println("总编码长度 (WPL): " + totalLength);
    }
}

