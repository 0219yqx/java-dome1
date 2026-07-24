package Array;

public class Box <T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }
    @Override
    public String toString() {
        return t.toString();
    }
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello World");
        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}
