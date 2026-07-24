package IO;

import java.io.*;

public class IODemo7 {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\新建文件夹");
        File dest = new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\Student1");
        copyDirectory(source, dest);
    }

    // 复制单个文件
    public static void copyFile(File file, File file1){
        try(FileInputStream fis = new FileInputStream(file);FileOutputStream fos = new FileOutputStream(file1)){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 复制整个目录
    public static void copyDirectory(File source, File dest) {
        dest.mkdirs();
        File[] files = source.listFiles();
        if(files == null) return;
        for (File file : files) {
            if(file.isDirectory()){
                copyDirectory(file, new File(dest,file.getName()));
            }else{
                copyFile(file, new File(dest , file.getName()));
            }
        }
    }
}
