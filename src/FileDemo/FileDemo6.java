package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo6 {
    //Text1
    public static void main(String[] args) throws IOException {
    File file1=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\FileDemo6.txt");
    boolean b= file1.createNewFile();
    System.out.println(b);
    //Text2
        File file2=new File("C:\\Users\\岳琪翔\\Desktop\\tupian");
        boolean b1=haveJPG(file2);
        System.out.println(b1);

    }
    private static boolean haveJPG(File file) {
        File[] files = file.listFiles();
        boolean found = false;
        if (files != null) {
            for (File f : files) {
                if (f.getName().endsWith(".jpg")) {
                    System.out.println("找到图片文件：" + f.getAbsolutePath());
                    found = true;
                }
            }
        }
        return found;
    }

}
