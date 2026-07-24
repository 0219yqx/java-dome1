package JdkTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String str = "2019-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String str2 = sdf2.format(date);
        System.out.println(str2);
        //需要把字符串转换为日期对象，然后再把日期对象格式化为新的字符串
    }
}
