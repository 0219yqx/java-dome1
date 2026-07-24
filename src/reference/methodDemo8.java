package reference;

import java.util.ArrayList;

public class methodDemo8 {
    public static void main(String[] args) {
        ArrayList<StudentMethodDemo8> list = new ArrayList<>();
        list.add(new StudentMethodDemo8("张三", 20));
        list.add(new StudentMethodDemo8("李四", 21));
        list.add(new StudentMethodDemo8("王五", 22));
        methodDemo8 demo = new methodDemo8();
        demo.show(list);
    }

    private void show(ArrayList<StudentMethodDemo8> list) {
        String[] list1 = list.stream().map(this::toStr).toArray(String[]::new);
        for (String s : list1) {
            System.out.println(s);
        }
    }

    private String toStr(StudentMethodDemo8 student) {
        return student.getName() + "-" + student.getAge();

    }
}

class StudentMethodDemo8 {
    private String name;
    private int age;

    public StudentMethodDemo8() {
    }

    public StudentMethodDemo8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "StudentMethodDemo8{name = " + name + ", age = " + age + "}";
    }
}
