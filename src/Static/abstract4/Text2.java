package Static.abstract4;

import ceshi.Animal;

public class Text2 {
    public static void main(String[] args) {
        Dog dog=new Dog() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
        dog.say();
        Dog dog1 = new Dog();
        dog1.say();
    }
}

