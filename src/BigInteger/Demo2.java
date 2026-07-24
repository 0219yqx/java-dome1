package BigInteger;

import java.math.BigInteger;

public class Demo2 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(10);
        BigInteger b = BigInteger.valueOf(20);
        BigInteger c = a.add(b);
        System.out.println(a);//10
        System.out.println(b);//20
        System.out.println(c);//30
        BigInteger d = b.subtract(a);
        System.out.println(d);//10
        BigInteger e = b.multiply(a);//超大数乘法也没问题
        System.out.println(e);//200
        BigInteger f = b.divide(a);//整数除法，只取商）
        System.out.println(f);//2
        // 注意：除数为 0 会抛异常！
        BigInteger g=BigInteger.valueOf(100);
        BigInteger h=BigInteger.valueOf(3);
        BigInteger []result=g.divideAndRemainder(h);//整数除法，返回商和余数
        System.out.println(result[0]);//33,即商
        System.out.println(result[1]);//1,即余数
        //BigInteger.valueOf(100).divideAndRemainder(BigInteger.valueOf(3))
        System.out.println(g.mod(h));//1


    }
}
