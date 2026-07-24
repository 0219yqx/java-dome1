package myStream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三","张无忌","张小龙","李逵");
        list.stream().filter(e-> e.startsWith("张")).filter(e-> e.length() == 3).forEach(System.out::println);
    }

}
