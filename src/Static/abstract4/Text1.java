package Static.abstract4;

public class Text1 {
    public static void main(String[] args) {
        Getting getting=new Getting() {
            @Override
            public void say() {
                System.out.println("hello");
            }
        };
        getting.say();
    }
}
