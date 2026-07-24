package Array;

import java.util.HashSet;
import java.util.Set;

public class Text13 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        System.out.println(set);
        set.add("hello");
        System.out.println(set.size());
        System.out.println(set.contains("hello"));
        System.out.println(set.contains("helle"));
        System.out.println(set.remove("hello"));
        System.out.println(set);
    }
}
