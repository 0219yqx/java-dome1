package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-25", "周芷若-24", "赵敏-13", "张强-20",
                "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split("-")[1]) > 20)
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));
        System.out.println(map);
    }
}
