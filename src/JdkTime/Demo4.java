package JdkTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) throws ParseException {
        String str = "2019-01-01 12:00:00";
        String str1 = "2019-01-01 12:10:00";
        String str2 = "2019-01-01 12:01:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(str);
        Date date2 = sdf.parse(str1);
        Date date3 = sdf.parse(str2);
        Long startTime = date1.getTime();
        Long endTime = date2.getTime();
        Long time = date3.getTime();
        if (time > startTime && time < endTime)
            System.out.println("在时间段内");
        else
            System.out.println("不在时间段内");
        //把时间戳转换成日期格式，提取他的毫秒值进行比较
    }
}
