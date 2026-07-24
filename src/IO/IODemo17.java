package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IODemo17 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\print.txt"))) {
            pw.println("Hello, world!");
            pw.println("Hello, Java!");
            // pw.close(); 自动调用，无需手动关闭
            // pw.flush(); 自动调用，无需手动刷新

        }
    }
}