package Map;

import java.util.ArrayList;
import java.util.Collections;

public class MapDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "bcd", "cde");//Collections可以一下子添加多个元素，原来的ArrayList只能添加单个元素
        System.out.println(list);
        Collections.shuffle(list);//打乱顺序
        System.out.println(list);
        Collections.sort(list);//排序，默认升序
        System.out.println(list);
        Collections.reverse(list);//反转顺序
        System.out.println(list);
    }
}
