package FileDemo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
//        public boolean isDirectory()
//          判断此路径名表示的File是否为文件夹
//          public boolean isFile()
//          判断此路径名表示的File是否为文件
//          public boolean exists()
//          判断此路径名表示的File是否存在
        File file1=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\新建文件夹");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        File file2=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\222.jpg");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());


    }
}
