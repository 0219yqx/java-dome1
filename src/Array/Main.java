package Array;

import java.util.Arrays;

class GirlFriend {
    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        GirlFriend[] gf = {new GirlFriend("Rahul", 20, 5.5),
                new GirlFriend("Anual", 23, 5.3),
                new GirlFriend("Bahsd", 19, 5.1)};

        System.out.println("原始数组");
        printArray(gf);

        Arrays.sort(gf, (o1, o2) -> {//匿名内部类
            if (o1.getAge() > o2.getAge()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if(o1.getHeight() < o2.getHeight()) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
            return o1.getName().compareTo(o2.getName());

        });

        System.out.println("排序后数组");
        printArray(gf);
    }

    public static void printArray(GirlFriend[] array) {
        for (GirlFriend gf : array) {
            System.out.println(gf);
        }
    }
}
