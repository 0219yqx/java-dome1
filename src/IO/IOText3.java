package IO;

import java.io.*;
import java.util.*;

public class IOText3 {
    public static void main(String[] args) throws Exception {
        List<String[]> boys = new ArrayList<>();
        List<String[]> girls = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\name"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split("-");
                if (arr.length != 2) {
                    continue;
                }
                if (arr[1].equals("男")) {
                    boys.add(arr);
                } else if (arr[1].equals("女")) {
                    girls.add(arr);
                }
            }
        }

        Random random = new Random();
        int boyCount = 0;
        int girlCount = 0;
        for (int i = 0; i < 100; i++) {
            if (random.nextInt(10) < 7) {
                boyCount++;
                System.out.println(boys.get(random.nextInt(boys.size()))[0]);
            } else {
                girlCount++;
                System.out.println(girls.get(random.nextInt(girls.size()))[0]);
            }
        }
        System.out.printf("男生占比 %.2f%%，女生占比 %.2f%%，接近 7:3 吗？%n",
                boyCount / 100.0, girlCount / 100.0);
    }
}