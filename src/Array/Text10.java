package Array;

import java.util.LinkedList;

public class Text10 {
    //LinkedList集合的使用,在这里的用途是队列队列的使用
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.offer("java");
        list.offer("c++");
        list.offer("c#");
        System.out.println(list);
        String first =list.peek();//获取但不删除第一个元素
        System.out.println(first);
        while (!list.isEmpty()){
            String s = list.poll();
            System.out.println(s);
        }
    }
}
