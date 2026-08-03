package IO;

import java.io.*;
import java.util.*;

public class IOText4 {
    public static void main(String[] args) throws Exception {
        int count = 0;

        // 读取 count.txt 中的当前计数
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\count.txt")))) {
            String line = br.readLine();
            if (line != null && !line.trim().isEmpty()) {
                count = Integer.parseInt(line);
            }
        }

        count++;
        if (count == 3) {
            System.out.println("厉害");
            return;
        }

        // 随机点名
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\name")))) {
            List<String[]> list = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line.split("-"));
            }
            Random random = new Random();
            int index = random.nextInt(list.size());
            System.out.println(list.get(index)[0]);
        }

        // 计数写回 count.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\count.txt"))) {
            bw.write(String.valueOf(count));
        }
    }
}