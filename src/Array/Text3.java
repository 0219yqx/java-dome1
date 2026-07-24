package Array;

interface Calculator {
    int add(int a, int b);
}
public class Text3 {
    public static void main(String[] args) {
        Calculator add= Integer::sum;
        System.out.println(add.add(10,20));
    }
}
