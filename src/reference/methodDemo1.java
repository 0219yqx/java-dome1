package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class methodDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3");
        //常规方法
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(Integer.parseInt(list.get(i)));
        }
        System.out.println(list1);
        //方法引用（静态）
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
