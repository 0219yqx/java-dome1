package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
//        try (FileInputStream fis = new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1")) {
//            int b;
//            while ((b = fis.read()) != -1) {
//                System.out.print((char) b);
//            }
//        }
//        try(FileInputStream fis = new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1");
//            FileOutputStream fos=new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3")){
//            int b;
//            while ((b = fis.read()) != -1) {
//                fos.write(b);
//                System.out.print((char) b);
//            }
//        }
        try(FileInputStream fis = new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo1");
            FileOutputStream fos=new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3",true)) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }
    }
}
