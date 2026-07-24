package reference;


class Person {
    public void speak() {
        System.out.println("hello");
    }
}

class Student extends Person {
    @Override
    public void speak() {
        System.out.println("hello student");
    }

    public void show() {
        Runnable r1 = this::speak;
        r1.run();
        Runnable r2 = super::speak;
        r2.run();
    }
}

public class menthodDemo3 {
    public static void main(String[] args) {
        new Student().show();
    }
}


