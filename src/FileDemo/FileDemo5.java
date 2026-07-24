package FileDemo;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\student-management");
        File[] files = f1.listFiles();//获取目录下的所有文件
        if (files != null) {
            for (File f : files) {
                if (f.isFile() && f.getName().endsWith(".txt"))
                    System.out.println(f);
            }
        } else {
            System.out.println("目录不存在");
        }
    }
}
