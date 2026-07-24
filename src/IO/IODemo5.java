package IO;

import java.io.FileReader;
import java.io.IOException;

public class IODemo5 {
    public static void main(String[] args) throws IOException {
        //空参构造器，创建FileReader对象
       try(FileReader fr =new FileReader("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3")){
           int b;
           while ((b=fr.read())!=-1){
               System.out.print((char)b);
           }
       }
       //有参
        try(FileReader fr =new FileReader("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3")){
           char[] chars=new char[1024];
            int len;
            while ((len=fr.read(chars))!=-1){
                //数组转换成字符串
                System.out.println(new String(chars,0,len));
            }
        }

    }
}
