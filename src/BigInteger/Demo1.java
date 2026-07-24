package BigInteger;

import java.util.Random;
import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {
//        public BigInteger(int num, Random rnd)
//          作用：生成一个随机的大整数
//      范围：[0, 2^num - 1]（0 到 2 的 num 次方减 1）
        Random random = new Random();
         // 生成 0 ~ 2^4-1 之间的随机数，即 0 ~ 15
        BigInteger bi = new BigInteger(4, random);
        System.out.println(bi);
         // 生成 0 ~ 2^10-1 之间的随机数，即 0 ~ 1023
        BigInteger bi2 = new BigInteger(10, random);
        System.out.println(bi2);
//        public BigInteger(String val)
//         作用：把字符串转换成 BigInteger
        long max = Long.MAX_VALUE;
        System.out.println(max);// 9223372036854775807(为long的最大值)
        BigInteger bi3 = new BigInteger("9223372036854775807");// 只能为整数，可以存特别特别大的数，不能有小数，否则会报错
        System.out.println(bi3);
//        public BigInteger(String val, int radix)
//          作用：把指定进制的字符串转换成 BigInteger
        BigInteger bi4 = new BigInteger("123", 16);
        System.out.println(bi4);// 把十六进制的字符串转换成大整数，即十进制下的数：189
//        public static BigInteger valueOf(long val)
//          作用：把 long 值转换为 BigInteger
        BigInteger b4 = BigInteger.valueOf(16);
        BigInteger b3 = BigInteger.valueOf(16);
        System.out.println(b4 == b3);// true，因为两个对象在内存中的地址相同,-16到15之间的数在内存中是共享的
        BigInteger bi5 = BigInteger.valueOf(100);
        BigInteger b5 = BigInteger.valueOf(100);
        System.out.println(bi5 == b5);// false，因为两个对象在内存中的地址不同
        //BigInteger 对象一旦创建，里面的值不能改变！
        BigInteger bi6 = BigInteger.valueOf(10);// 创建一个BigInteger对象，值为10
        BigInteger result = bi6.add(BigInteger.valueOf(20));// 调用add方法，加上20
        System.out.println(result);// 30,但是原来的bi6的值不变
        System.out.println(bi6);// 10,原来的值不变
    }
}
