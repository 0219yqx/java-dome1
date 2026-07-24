package reference;

import java.util.ArrayList;
import java.util.Collections;

public class methodDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
