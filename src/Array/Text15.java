package Array;

import java.util.TreeSet;

public class Text15 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>((o1, o2)->{
            int num=o1.getAge()-o2.getAge();
            if(num==0){
                num=o1.getName().compareTo(o2.getName());
            }
            return num;
        });
        set.add(new Student("张三",18));
        set.add(new Student("张三",18));
        set.add(new Student("李四",19));
        set.add(new Student("王五",18));
        set.forEach(System.out::println);
    }
    static class Student{
        String name;
        int age;
        public Student(){

        }
        public Student(String name,int age){
            this.name = name;
            this.age = age;
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
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
