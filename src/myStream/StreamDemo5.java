package myStream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");
        //List
        list.stream().filter(s->"男".equals(s.split("-")[1])).forEach(System.out::println);
        //list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toList());
        //Set
        Set<String> set= list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //Map
        Map<String,Integer> map=list.stream().filter(s->"男".equals(s.split("-")[1])).collect(Collectors.toMap(s->s.split("-")[0], s->Integer.parseInt(s.split("-")[2])));
        System.out.println(map);

    }
}
