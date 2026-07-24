package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1");
        //如果文件里面已经有了内容，这会把里面的东西删除，重新写入新的内容
//        fos.write(97);
//        fos.write("abc".getBytes());//getBytes()将字符串转换为字节数组
//        fos.close();
        byte[] bytes={98,99,100,101,102};
        fos.write(bytes,2,3);
        fos.close();
    }
}
