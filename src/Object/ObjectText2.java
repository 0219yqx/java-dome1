package Object;

import java.util.Objects;

public class ObjectText2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("zhangsan", 20);
        boolean result= Objects.equals(s1,s2);
        System.out.println(result);//true,因为重写了equals方法
    }
}
