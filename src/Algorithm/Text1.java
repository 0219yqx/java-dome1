package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Text1 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5,3};
        int number = 3;
        List<Integer> lists = findNumber(arr, number);//[2, 5]
        System.out.println(lists);


    }
    public static ArrayList<Integer> findNumber(int []arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
