package FileDemo;

import java.io.File;
import java.util.HashMap;

public class FileDemo8 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\岳琪翔\\Desktop\\tupian\\student-management\\src");
        HashMap<String,Integer> map=new HashMap<>();
        count(file,map);
        System.out.println(map);
    }
    private static void count(File file, HashMap<String, Integer> map) {
        File[] files=file.listFiles();
        if (files == null) {
            return;
        }
        for (File f:files) {
            if(f.isDirectory()){//如果是文件夹，递归调用
                count(f,map);
            }else{
                String name=f.getName();
                int index=name.lastIndexOf('.');
                String suffix=name.substring(index+1);
                Integer count=map.get(suffix);
                if(count==null){
                    map.put(suffix,1);
                }else{
                    map.put(suffix,count+1);
                }
            }
        }

    }
}
