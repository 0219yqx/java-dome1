package Array;

import java.util.ArrayList;
import java.util.Collection;

public class Text6 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Hello");
        System.out.println(c);
        c.add("World");
        System.out.println(c);
        c.remove("Hello");
        System.out.println(c);
        int size = c.size();
        System.out.println(size);
        boolean b = c.contains("Hello");
        System.out.println(b);
        System.out.println(c.contains("World"));
            
    }
}
