package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {//ArrayList的遍历
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
//        System.out.print("[");
//        for (int i = 0; i < list.size(); i++) {
//
//            if(i == list.size()-1){
//                System.out.print(list.get(i));
//            }else{
//                System.out.print(list.get(i) + ",");
//            }
//        }
//        System.out.print("]");
       for (String s : list) {
           System.out.print(s + " ");
       }
    }

}

