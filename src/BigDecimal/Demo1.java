package BigDecimal;

import java.math.BigDecimal;

public class Demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = BigDecimal.valueOf(222.222);//valueOf方法,把double类型转化为字符串，是字符串更精准
        BigDecimal add = bd1.add(bd2);//加法
        BigDecimal sub = bd1.subtract(bd2);//减法
        BigDecimal mul = bd1.multiply(bd2);//乘法
        BigDecimal div = bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP);//除法，保留两位小数，四舍五入
        System.out.println("加法：" + add);
        System.out.println("减法：" + sub);
        System.out.println("乘法：" + mul);
        System.out.println("除法：" + div);//123.456/222.222=0.56
        BigDecimal x = new BigDecimal("1.20");
        BigDecimal y = BigDecimal.valueOf(1.2);
        //// compareTo 方法：x < y 返回 -1，x == y 返回 0，x > y 返回 1
        int result = x.compareTo(y);//比较大小，返回值为int类型
        System.out.println(result);
        //// equals 方法：不仅比较数值，还比较精度
        System.out.println(x.equals(y)); // false，因为 "1.2" 和 "1.20" 的字符串表示不同
    }
}
