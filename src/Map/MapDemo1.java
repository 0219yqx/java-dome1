package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
//        V put(K key,V value)            添加元素
//V remove(Object key)            根据键删除键值对元素
//void clear()                    移除所有的键值对元素
//boolean containsKey(Object key) 判断集合是否包含指定的键
//boolean containsValue(Object value) 判断集合是否包含指定的值
//boolean isEmpty()               判断集合是否为空
//int size()                      集合的长度，也就是集合中键值对的个数
        Map<String,String> map = new HashMap<>();
        String value1 = map.put("张三","李四");
        map.put("王五","赵六");
        String value2 =map.put("张三","王五");
        //put方法是覆盖和添加
        //如果已经添加了键和值，则第一次添加的值被覆盖，输出的键值对是最后一次的键值对元素，如果单独输出值时，输出第一个键值对元素,如果没有则输出null
        //如果没有添加键，则添加键值对元素
        System.out.println(value1);//
        System.out.println(value2);
        System.out.println(map);
        //删除元素,删除成功返回被删除的值，删除失败返回null
        String removeValue1 =map.remove("张三");
        System.out.println(removeValue1);
        System.out.println(map);
        //清除所有元素
        //map.clear();
        //判断集合是否包含指定的值
        boolean flag = map.containsKey("张三");
        System.out.println(flag);
        //判断集合是否包含指定的值
        boolean flag1 = map.containsValue("王五");
        System.out.println(flag1);
        //判断集合是否为空
        System.out.println(map.isEmpty());
        //集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());
    }
}
