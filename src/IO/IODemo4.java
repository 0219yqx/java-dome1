package IO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IODemo4 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //乱码的由来
        String str = "你好";
        byte[] bytes = str.getBytes();//使用默认的编码表进行转换，默认是UTF-8
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = str.getBytes("GBK");//使用指定的编码表进行转换
        System.out.println(Arrays.toString(bytes1));
        //解码
        String str2 = new String(bytes);
        System.out.println(str2);
        String str3 = new String(bytes,"GBK");//UTF-8解码GBK编码的字节数组，会报错
        System.out.println(str3);

    }
}
