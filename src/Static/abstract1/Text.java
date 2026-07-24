package Static.abstract1;

public class Text {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙", 2);
        System.out.println(frog.getName()+" "+frog.getAge());
        frog.eat();
        frog.swim();
    }
}
