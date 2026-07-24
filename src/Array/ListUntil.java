package Array;

import java.util.ArrayList;

public class ListUntil {

    // 私有构造，防止创建对象（工具类常用）
    private ListUntil() {}

    // 泛型方法：打印列表所有元素
    public static <E> void printList(ArrayList<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------");
    }

    // 另一个方法：打印单个元素
    public static <E> void show(E e) {
        System.out.println(e);
    }
}
