package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MapDome13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan", "lisi", "wangwu", "zhaoliu", "tianqi");
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(list);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {

            if (list1.isEmpty()) {
                list1.addAll(list);
            }
            int index = random.nextInt(list1.size());
            String name = list1.remove(index);
            System.out.println(name);
        }
    }
}
