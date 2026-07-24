package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IODemo6 {
    public static void main(String[] args) {
        try(FileWriter fw =new FileWriter("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3",true)){
            fw.write("\r\n");
            fw.write("hello");
            fw.write(new char[]{'a','b','c'},1,2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
