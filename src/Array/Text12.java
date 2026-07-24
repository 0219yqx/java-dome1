package Array;

import java.util.ArrayList;
import java.util.List;

public class Text12 {
    public static void main(String[] args) {
        String[] arr = {"java","c", "c++",null};
        List<String> list = filterNonNul( arr);
        System.out.println(list);
        Integer[] arr1 = {1,2,3,4,5,null};
        List<Integer> list1 = filterNonNul( arr1);
        System.out.println(list1);
    }
    public static <T> List<T> filterNonNul(T[] arr){
        List<T> list = new ArrayList<>();
        for (T t : arr) {
            if (t != null) {
                list.add(t);
            }
        }
        return list;
    }
}
