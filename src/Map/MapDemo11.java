package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MapDemo11 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "bcd", "cde");
        Random random = new Random();
        int index = random.nextInt(list.size());
        System.out.println(list.get(index));
    }
}
