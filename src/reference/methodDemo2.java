package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class methodDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //常规写法
        list.stream()
                .filter(e -> e.startsWith("张"))
                .filter(e->e.length()==3)
                .forEach(System.out::println);
        //方法引用写法
        list.stream()
                .filter(new methodDemo2Text1()::pass)
                .forEach(System.out::println);
        //匿名内部类
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        });
        //this关键字,this 只在实例方法里有，static 方法里没有 this。
    }
    public  boolean pass(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
