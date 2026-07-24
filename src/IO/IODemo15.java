package IO;

import java.io.*;
import java.util.ArrayList;

public class IODemo15 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("张三", 20));
        list.add(new Student1("李四", 21));
        list.add(new Student1("王五", 22));
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\Student"))) {
            oos.writeObject(list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\Student"))) {
            ArrayList<Student1> list1 = (ArrayList<Student1>) ois.readObject();
            for (Student1 s : list1) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
class Student1 implements Serializable {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1() {
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
        return "Student1{name = " + name + ", age = " + age + "}";
    }
}