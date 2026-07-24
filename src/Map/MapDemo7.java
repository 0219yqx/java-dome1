package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapDemo7 {
    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<>();
        map.put(new Student("张三",18),"111");
        map.put(new Student("李四",19),"222");
        map.put(new Student("王五",20),"222");
        map.put(new Student("王五",20),"333");
        map.forEach((key,value)-> System.out.println(key+"--"+value));

    }
    static class Student implements Comparable<Student>{
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
        @Override
        public int compareTo(Student o) {
            int result = this.age - o.age;
            if(result==0){
                return this.name.compareTo(o.name);
            }
            return result;
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
    }
}
