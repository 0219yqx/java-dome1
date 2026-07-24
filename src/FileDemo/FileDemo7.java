package FileDemo;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\student-management");
        long len=getLength(file);
        System.out.println(len);
    }
    private static long getLength(File file) {
        long len=0;
        File[] files=file.listFiles();
        if (files == null) {
            return file.length();
        }
        for (File f:files) {
            if(f.isDirectory()){//如果是文件夹，递归调用
                len+=getLength(f);
            }else{
               len+=f.length();
            }
        }
        return len;
    }
}
