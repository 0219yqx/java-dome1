package Array;
interface Printer {
    void print(String s);
}
public class Text4 {
    public static void main(String[] args) {
        Printer printer= System.out::println;
        printer.print("Hello");
    }
}
