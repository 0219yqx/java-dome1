package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","张三的value");
        map.put("李四","李四的value");
        map.put("王五","王五的value");
        // 使用Lambda表达式遍历Map，打印每个键值对
        map.forEach((key,value)-> System.out.println(key+"--"+value));
    }
}
