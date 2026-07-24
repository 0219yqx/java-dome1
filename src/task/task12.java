package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class task12 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student("张三", 18), 100);
        map.put(new Student("李四", 19), 90);
        map.put(new Student("王五", 20), 80);
        map.forEach((key, value) -> System.out.println(key + "--" + value));
    }

    static class Student {
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }
}