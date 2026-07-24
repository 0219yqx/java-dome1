package Static.abstract5;

import javax.swing.*;
import java.awt.*;

public class SimpleGui {
    public static void main(String[] args) {
        // 1. 创建窗口 (JFrame)
        JFrame frame = new JFrame("若冰的第一个 Java 界面");

        // 2. 设置关闭窗口时的操作（点击关闭按钮时退出程序）
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. 设置窗口大小
        frame.setSize(400, 300);

        // 4. 创建一个标签组件
        JLabel label = new JLabel("你好，若冰！", SwingConstants.CENTER);
        label.setFont(new Font("微软雅黑", Font.PLAIN, 20));

        // 5. 将标签添加到窗口中
        frame.add(label);

        // 6. 设置窗口可见（记得一定要写这行，否则窗口出不来）
        frame.setVisible(true);
    }
}
