package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class IODemo14 {
    //反序列化
    public static void main(String[] args) throws Exception {
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\Student"))){
           Student s = (Student) ois.readObject();//反序列化
           System.out.println(s.getName() + " " + s.getAge());
       }
    }
}
