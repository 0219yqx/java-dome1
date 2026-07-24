package reference;

import java.util.ArrayList;

public class methodDemo7 {
    public static void main(String[] args) {
        ArrayList<StudentMethodDemo7> list = new ArrayList<>();
        list.add(new StudentMethodDemo7("张三", 20));
        list.add(new StudentMethodDemo7("李四", 21));
        list.add(new StudentMethodDemo7("王五", 22));
        String[] arr=list.stream().map(StudentMethodDemo7::getName).toArray(String[]::new);
        for (String name : arr) {
            System.out.println(name);
        }
    }

}
class StudentMethodDemo7{
    private String name;
    private int age;

    public StudentMethodDemo7() {
    }

    public StudentMethodDemo7(String name, int age) {
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
        return "StudentMethodDemo7{name = " + name + ", age = " + age + "}";
    }
}
