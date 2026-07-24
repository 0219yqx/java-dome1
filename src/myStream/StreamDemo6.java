package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 13,22,3,6,31,45,85);
        List<Integer> list1=list.stream().filter(x->x%2==0).toList();
        System.out.println(list1);
    }
}
