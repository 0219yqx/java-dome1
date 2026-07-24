package String;

import java.util.StringJoiner;

public class String11 {//StringJoiner的应用，多用于字符串的拼接
    public static void main(String[] args) {
      StringJoiner sj = new StringJoiner("---");
      sj.add("hello").add("world").add("java");//添加字符串
      int len=sj.length();//获取字符串的长度
        String sj1=sj.toString();//将StringJoiner转换为字符串
        System.out.println(sj1);
      System.out.println(sj);
      System.out.println(len);

    }
}
