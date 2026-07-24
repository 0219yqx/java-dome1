package Array;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Text14 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(18,"张三"));
        set.add(new Student(18,"张苦"));
        set.add(new Student(18,"张三"));
        for (Student student : set)//只能用增强for循环
            System.out.println(student);
//        Iterator<Student> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            System.out.println(student);
//        }
        set.forEach(student -> System.out.println(student));//lambda表达式
    }
    static  class Student{
        int age;
        String name;
        public Student(int age,String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}
