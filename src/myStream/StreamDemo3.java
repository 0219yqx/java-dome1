package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc","asd","abd","abc","asd","abd","abc");
        //limit(n) 限制流中的元素个数
        //skip(n) 跳过前n个元素
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------------");
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("----------------------");
        //distinct 去重,如果是自定义对象，需要重写equals和hashCode方法
        list.stream().distinct().forEach(System.out::println);
        System.out.println("----------------------");
        //concat 合并流
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "aaa","bbb","ccc");
        Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);//合并流
        System.out.println("----------------------");
        //map 映射
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------------");
        //flatMap 扁平化流，将流中的每个元素映射为另一个流，然后将所有流连接起来成为一个流
        Stream<ArrayList> stream = Stream.of(new ArrayList<>(), new ArrayList<>());
        stream.flatMap(x -> x.stream()).forEach(System.out::println);

    }
}
