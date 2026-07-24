package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class MapDemo14 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"苏州","扬州","南京");
        map.put("江苏",list);
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"杭州","温州");
        map.put("浙江",list1);
        map.forEach((k,v)->{
            String str=String.join(",",v);//将集合转换成字符串
            System.out.println(k+"省"+"包含的城市有："+str);
        });
    }
}
