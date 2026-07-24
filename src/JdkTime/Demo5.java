package JdkTime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo5 {
    public static void main(String[] args) {
        /*
         * static Instant now()                             获取当前时间的Instant对象（标准时间）
         * static Instant ofXxx(long epochMilli)            根据（秒/毫秒/纳秒）获取Instant对象
         * ZonedDateTime atZone(ZoneId zone)                指定时区
         * boolean isXxx(Instant otherInstant)              判断系列的方法
         * Instant minusXxx(long millisToSubtract)          减少时间系列的方法
         * Instant plusXxx(long millisToSubtract)           增加时间系列的方法
         */
        Instant now = Instant.now();
        System.out.println(now);//伦敦时间
        Instant instant = Instant.ofEpochMilli(0L);//公元1970年1月1日 0时0分0秒
        System.out.println(instant);
        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000);//1秒后加上10亿纳秒
        System.out.println(instant2);
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        System.out.println(now.atZone(shanghai));
        Instant tomorrow = now.plusSeconds(24 * 60 * 60);

        System.out.println(now.isBefore(tomorrow)); // true
        System.out.println(now.isAfter(tomorrow));  // false
//        static ZonedDateTime now()                             获取当前时间的ZonedDateTime对象
//          static ZonedDateTime ofXxx(...)                       获取指定时间的ZonedDateTime对象
//          ZonedDateTime withXxx(时间)                           修改时间系列的方法
//ZonedDateTime minusXxx(时间)                          减少时间系列的方法
//ZonedDateTime plusXxx(时间)                           增加时间系列的方法
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        ZonedDateTime zdt1 = ZonedDateTime.of(2023, 1, 1, 0, 0, 0, 0, shanghai);
        System.out.println(zdt1);
        ZonedDateTime zdt2 = zdt.withYear(2024);//修改年份
        System.out.println(zdt2);
        ZonedDateTime zdt3 = zdt.minusDays(1);//减少1天
        System.out.println(zdt3);
        ZonedDateTime zdt4 = zdt.plusDays(1);//增加1天
        System.out.println(zdt4);
    }
}
