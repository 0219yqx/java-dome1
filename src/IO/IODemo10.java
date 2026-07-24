package IO;

import java.io.*;

public class IODemo10 {
    public static void main(String[] args) throws IOException {
        // 字节缓冲输入流
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3"))) {
//            int b;
//            while ((b = bis.read()) != -1) {
//                System.out.print((char) b);
//            }
//        }
        // 字节缓冲输出流一次性输出多个
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3"));
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo2"))) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

        }
    }
}
