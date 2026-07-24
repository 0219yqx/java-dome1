package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {//ArrayList的增删改查

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");//添加元素
        list.add("world");
        list.set(0, "java");//修改元素
        System.out.println(list);
        list.remove(0);//删除元素
        System.out.println(list);
        System.out.println(list.get(0));//查询元素不带[]
        System.out.println(list.size());//查询元素个数
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
