package Map;

import java.util.*;

public class MapDemo6 {
    public static void main(String[] args) {
//        TreeMap<String,Integer> tm=new TreeMap<>(Collections.reverseOrder());//降序排列
//        tm.put("张三",23);
//        tm.put("李四", 24);
//        tm.put("王五",25);
//        tm.put("赵六",26);
//        System.out.println( tm);
        TreeMap<String,Integer> tm=new TreeMap<>();//TreeMap默认是按照key的自然顺序进行排序的，如果要自定义排序规则，则需要传入一个Comparator对象。
        tm.put("张三",23);
        tm.put("李四", 24);
        tm.put("王五",25);
        tm.put("赵六",26);

        System.out.println(tm);
    }
}
