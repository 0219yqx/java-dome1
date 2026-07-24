package myStream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "a", "b", "c");
//        list.stream().forEach(System.out::println);// 打印a,b,c
//        System.out.println(list);


//        List<Integer> list = Arrays.asList(5,7,3,29,2,4,1);// 创建集合
//        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(list1);


        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.entrySet().stream().forEach(System.out::println);// 打印a=1,b=2,c=3
        map.keySet().stream().forEach(System.out::println);// 打印a,b,c
    }
}
