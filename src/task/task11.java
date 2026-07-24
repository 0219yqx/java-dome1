package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class task11 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("张三","张三的value");
        map.put("李四","李四的value");
        map.put("王五","王五的value");
        Set<Map.Entry<String,String>>entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

    }
}
