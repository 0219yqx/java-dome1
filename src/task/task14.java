package task;

import java.util.Map;
import java.util.TreeMap;

public class task14 {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("张三",23);
        tm.put("李四", 24);
        tm.put("王五",25);
        tm.put("赵六",26);
        System.out.println( tm);//升序排列
        Map<String,Integer> map= new TreeMap<>((k1, k2)->k2.compareTo(k1));
        System.out.println(map);
    }
}
