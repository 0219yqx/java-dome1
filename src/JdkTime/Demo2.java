package JdkTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * public SimpleDateFormat()                    默认格式
         * public SimpleDateFormat(String pattern)      指定格式
         *
         * public final String format(Date date)        格式化（日期对象 -> 字符串）
         * public Date parse(String source)             解析（字符串 -> 日期对象）
         */
        Time1();
        Time2();


    }

    private static void Time2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        Date date = new Date();
        String str = sdf.format(date);
        try {
            Date date1 = sdf.parse(str);//字符串转日期对象
            System.out.println(date1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Time1() {
        SimpleDateFormat sdf = new SimpleDateFormat();//默认格式yyyy-MM-dd HH:mm:ss
        Date date = new Date();
        String str = sdf.format(date);//
        System.out.println(str);
        Date date1 = new Date(0L);
        String str1 = sdf.format(date1);
        System.out.println(str1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");//指定格式EE表示星期
        String str2 = sdf2.format(date);
        System.out.println(str2);
    }
}
