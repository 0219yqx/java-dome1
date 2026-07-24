package Array;

import java.util.ArrayList;
import java.util.List;

public class Text8 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(0,"0");
        list.remove(2);
        list.set(1,"2");
        String s = list.get(1);
        list.forEach(System.out::println);
    }
}
