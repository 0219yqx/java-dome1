package FileDemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        //根据字符串里面的对象改成File对象
        String path = "D:\\Java\\Java_Study\\src\\File";
        File file = new File(path);
        System.out.println(file);
        //父级路径加上子级路径
        String parent="\"D:\\\\Java\\\\Java_Study\\\\src";
        String child="File";
        File file1 = new File(parent, child);
        System.out.println(file1);
        //
        File parent2=new File("D:\\Java\\Java_Study\\src");
        String child2="File";
        File file2 = new File(parent2, child2);
        System.out.println(file2);
    }
}
