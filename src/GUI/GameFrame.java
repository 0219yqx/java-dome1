package GUI;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        initFrame();
        initJMenuBar();


        this.setVisible(true);
    }

    private void initJMenuBar() {
        JMenuBar menuBar = new JMenuBar();//创建菜单栏
        JMenu function = new JMenu("功能");//创建菜单
        JMenu about = new JMenu("关于");//创建菜单
        JMenuItem replay = new JMenuItem("重新游戏");//创建菜单项
        JMenuItem reLogin = new JMenuItem("重新开始");//创建菜单项
        JMenuItem exit = new JMenuItem("退出");//创建菜单项
        JMenuItem account = new JMenuItem("公众号");//创建菜单项

        function.add(replay);//将菜单项添加到菜单
        function.add(reLogin);//将菜单项添加到菜单
        function.add(exit);//将菜单项添加到菜单

        about.add(account);//将菜单项添加到菜单

        menuBar.add(function);//将菜单添加到菜单栏
        menuBar.add(about);//将菜单添加到菜单栏

        this.setJMenuBar(menuBar);//将菜单栏添加到窗口
    }

    private void initFrame() {
        this.setSize(500, 500);//设置窗口大小
        this.setTitle("拼图单机版v1.0");//设置窗口标题
        this.setAlwaysOnTop(true);//设置窗口置顶
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置窗口关闭方式
    }
}