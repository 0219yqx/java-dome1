package oj;

import java.util.ArrayList;
import java.util.Scanner;

public class oj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 使用ArrayList动态存储数组元素
            ArrayList<Integer> arr = new ArrayList<>();

            // 读取数组（直到遇到-1）
            while (true) {
                int num = sc.nextInt();
                if (num == -1) {
                    break;
                }
                arr.add(num);
            }

            // 读取要查找的数字
            int target = sc.nextInt();

            // 查找所有匹配的位置
            ArrayList<Integer> positions = new ArrayList<>();
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) == target) {
                    positions.add(j);
                }
            }

            // 输出结果
            if (positions.size() > 0) {
                for (int j = 0; j < positions.size(); j++) {
                    if (j > 0) {
                        System.out.print(" ");
                    }
                    System.out.print(positions.get(j));
                }
                System.out.println();
            } else {
                System.out.println("Not found.");
            }
        }

        sc.close();
    }
}