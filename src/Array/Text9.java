package Array;

import java.util.LinkedList;

public class Text9 {
    // LinkedList集合的使用,在这里的用途是栈
    public static void main(String[] args) {

        // 创建栈（用 LinkedList 实现）
        LinkedList<String> stack = new LinkedList<>();

        // ========== 压栈（push）- 添加元素到顶部 ==========
        stack.push("第一层");    // 栈: [第一层]
        stack.push("第二层");    // 栈: [第二层, 第一层]  ← 第二层在顶部
        stack.push("第三层");    // 栈: [第三层, 第二层, 第一层]

        System.out.println("当前栈: " + stack);
        // 输出: [第三层, 第二层, 第一层]
        //       ↑顶部                ↑底部

        // ========== 看栈顶（peek）- 不删除 ==========
        String top = stack.peek();  // 看最上面的，不拿走
        System.out.println("栈顶是: " + top);  // 第三层

        // ========== 弹栈（pop）- 取出并删除顶部 ==========
        //迭代器
        while (!stack.isEmpty()) {
            String layer = stack.pop();  // 取出顶部，并删除
            System.out.println("弹出: " + layer);
        }
        // 输出:
        // 弹出: 第三层  ← 最后进的，最先出
        // 弹出: 第二层
        // 弹出: 第一层  ← 最先进的，最后出

        // 栈空了，再pop会报错
        // stack.pop();  // ❌ NoSuchElementException
    }
}

