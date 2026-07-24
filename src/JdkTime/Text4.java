package JdkTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = scanner.nextInt();
        System.out.println("请输入一个月份：");
        int month = scanner.nextInt();
        System.out.println("请输入一个月份中的天数：");
        int day = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, day);
        LocalDate localDate1 = LocalDate.now();
        long days= ChronoUnit.DAYS.between(localDate, localDate1);//计算相差天数
        System.out.println("相差天数："+days);

    }
}
