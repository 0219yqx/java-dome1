package JdkTime;


import java.time.Year;
import java.util.Scanner;

public class Text5 {
    public static void main(String[] args) {
        //判断是否为闰年
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isLeap= Year.isLeap(year);//判断是否为闰年
//        Year.isLeap(year)是Java 8中java.time包提供的静态方法，用于判断指定年份是否为闰年。
//        它的用法非常简洁，核心逻辑基于闰年定义（能被4整除但不能被100整除，或能被400整除），直接返回boolean值（true表示闰年，false表示平年）。
        System.out.println(isLeap);
    }

}
