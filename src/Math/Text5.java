package Math;

import java.sql.SQLOutput;

public class Text5 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());// 获取当前计算机的CPU核数
        Runtime runtime = Runtime.getRuntime();// 获取当前计算机的运行环境
        System.out.println(Runtime.getRuntime().maxMemory());// 获取当前计算机的内存大小
        System.out.println(Runtime.getRuntime().totalMemory());// 获取当前计算机的内存大小
        System.out.println(Runtime.getRuntime().freeMemory());// 获取当前计算机的内存大小
        runtime.exit(0);// 退出当前程序


    }
}
