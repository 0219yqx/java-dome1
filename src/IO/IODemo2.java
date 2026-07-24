package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1",true);
        //true表示追加写入，false表示覆盖原有内容
        fos.write("程序启动一遍".getBytes());
        fos.write("\r\n".getBytes());//换行
        fos.close();

    }
}
