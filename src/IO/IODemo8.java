package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo8 {
    // 加密文件:用^异或运算加密文件
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo2")) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b ^ 2);
            }
        }

    }
}
