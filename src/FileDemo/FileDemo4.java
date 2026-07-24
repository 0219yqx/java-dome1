package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
//        创建一个新的空的文件
//        public boolean createNewFile ()
//        创建单级文件夹
//        public boolean mkdir ()
//        创建多级文件夹
//        public boolean mkdirs ()
//        删除文件、空文件夹
//        public boolean delete ()
        File f1=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\FileDemo4.txt");
        boolean b=f1.createNewFile();
        System.out.println(b);
        File f2=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\FibleDemo4");
        boolean b1=f2.mkdir();
        System.out.println(b1);
        File f3=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\FibleDemo4\\FibleDemo5");
        boolean b2=f3.mkdirs();
        System.out.println(b2);
        File f4=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\FibleDemo4.txt");
        boolean b3=f4.delete();//只能删除文件和空文件夹，不经过回收站
        System.out.println(b3);
    }
}
