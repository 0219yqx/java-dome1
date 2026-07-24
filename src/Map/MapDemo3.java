package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        // 1. 获取Map中所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 2. 遍历Set集合，获取每一个键值对对象
        for (Map.Entry<String, String> entry : entrySet) {
            // 3. 根据键值对对象获取Key和Value
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
            }
}
