package Static.abstract3;

public class Text1 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        Outer.Inner.test();
        outer.test();
    }
}
