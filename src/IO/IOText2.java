package IO;

import java.io.*;
import java.util.*;

public class IOText2 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        List<String[]> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\name"), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line.split("-"));
            }
        }

        int index = random.nextInt(list.size());
        System.out.println(list.get(index)[0]);
    }
}