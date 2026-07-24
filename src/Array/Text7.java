package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Text7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        List<String> list1 =Arrays.asList("java", "c++", "python");
        System.out.println(list1);
        for (String s : list1) {
            System.out.println(s);
        }
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
        list1.forEach(System.out::println);//lambda表达式

    }
}
