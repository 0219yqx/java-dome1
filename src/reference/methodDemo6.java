package reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class methodDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom,23", "Jerry,34", "Bob,21");
        StudentMethodDemo6[] arr=list.stream().map(StudentMethodDemo6::new).toArray(StudentMethodDemo6[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
class StudentMethodDemo6{
    private String name;
    private int age;

    public StudentMethodDemo6() {
    }
    public StudentMethodDemo6(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);

    }

    public StudentMethodDemo6(String name, int age) {
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
        return "StudentMethodDemo6{name = " + name + ", age = " + age + "}";
    }
}
