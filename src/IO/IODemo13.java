package IO;

import java.io.*;

public class IODemo13 {
    //列序化流
    public static void main(String[] args) throws IOException {
        Student s = new Student("张三", 20);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\Student"));
        oos.writeObject(s);
        oos.close();
    }
}
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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