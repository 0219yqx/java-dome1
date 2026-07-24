package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Student,String> map=new HashMap<>();
        map.put(new Student("张三",18),"张三的value");
        map.put(new Student("李四",19),"李四的value");
        map.put(new Student("王五",20),"王五的value");
        map.forEach((key,value)-> System.out.println(key+"--"+value));
    }
     static class Student{
        private String name;
        private int age;
        public Student(){

        }
        public Student(String name,int age){
            this.name=name;
            this.age=age;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
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
            return Objects.hash(name, age);
        }
    }
}
