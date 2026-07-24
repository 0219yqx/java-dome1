package myStream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");
//        list.stream()
//                .sorted((s1, s2) -> {
//                    String[] split1 = s1.split("-");
//                    String[] split2 = s2.split("-");
//                    return Integer.parseInt(split1[1]) - Integer.parseInt(split2[1]);
//                })
//                .forEach(System.out::println);
        list.stream().map(s -> s.split("-")[1]).map(Integer::parseInt).sorted().forEach(System.out::println);
    }
}
