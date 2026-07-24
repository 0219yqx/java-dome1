package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class IODemo11 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader bis = new BufferedReader(new FileReader("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo3"))) {
            String line;
            while ((line = bis.readLine()) != null) {

                list.add(line);
            }
            Collections.sort(list, (o1, o2) -> {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return Integer.compare(i1, i2);
            });
            try(BufferedWriter bos = new BufferedWriter(new FileWriter("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo11"))){
                for (String s : list) {
                    bos.write(s);
                    bos.newLine();
                }
            }



        }
    }
}