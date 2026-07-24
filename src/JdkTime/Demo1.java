package JdkTime;



import java.util.Date;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        /*
         * public Date()                    创建Date对象，表示当前时间
         * public Date(long date)           创建Date对象，表示指定时间
         *
         * public void setTime(long time)   设置/修改毫秒值
         * public long getTime()            获取时间对象的毫秒值
         */
        Date date = new Date();
        System.out.println(date);
        Date date1 =new Date(10000L);//10000毫秒=10s
        System.out.println(date1);
        date1.setTime(20000L);
        System.out.println(date1);
        System.out.println(date1.getTime());
        Time1();
        Time2();

    }

    private static void Time2() {
        Random random = new Random();
        Date date5 = new Date(Math.abs(random.nextLong()));
        Date date6 = new Date(Math.abs(random.nextLong()));
        Long time = date6.getTime();
        Long time1 = date5.getTime();
        if(time>time1){
            System.out.println("date3时间大于date2");
        }else{
            System.out.println("date3时间小于等于date2");
        }
    }

    private static void Time1() {
        Date date2 =new Date(0L);
        Long time = date2.getTime();
        time=time+1000L*60*60*24;
        date2.setTime(time);
        System.out.println(date2);
    }
}
