package reference;

import java.util.ArrayList;
import java.util.Collections;


public class methodDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三，14","李四，15","王五，16");
        list.stream().map(StudentMethod::new).toList().forEach(System.out::println);
    }
}
class StudentMethod {
    private String name;
    private int age;
    public StudentMethod(String str) {
        String[] arr = str.split("，");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public StudentMethod() {
    }

    public StudentMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
