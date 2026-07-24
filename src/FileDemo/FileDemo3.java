package FileDemo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
    //    返回文件的大小(字节数量）
//    public long length()
//    返回文件的绝对路径
//    public String getAbsolutePath()
//    返回定义文件时使用的路径
//    public String getPath()
//    返回文件的名称，带后缀
//    public String getName()
//    返回文件的最后修改时间(时间毫秒值）
//    public long lastModified()
    public static void main(String[] args) {
        File file = new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\student-management");
        System.out.println(file.length());//字节 → KB 除以 1024，KB → MB 再除以 1024,文件夹的length为0，不存家也为0
        System.out.println(file.getAbsolutePath());//打印绝对路径
        System.out.println(file.getPath());//打印里输入的路径
        System.out.println(file.getName());//只认最后一段,文件夹的最后一段也为空字符串"",如果是一串字符串则直接输出这个字符串
        System.out.println(file.lastModified());//返回文件的最后修改时间(时间毫秒值）
        Date date = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));//格式化时间
    }
}
