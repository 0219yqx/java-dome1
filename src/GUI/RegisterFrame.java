package GUI;

import javax.swing.*;

public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        this.setSize(500, 500);//设置窗口大小
        this.setTitle("拼图单机版v1.0-----注册");//设置窗口标题
        this.setAlwaysOnTop(true);//设置窗口置顶
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗口关闭方式
        this.setVisible(true);
    }
}

