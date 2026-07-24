package Static.abstract2;

public class Text1 {
    public static void main(String[] args) {
        Outer outer=new Outer();//外部类
        Outer.Inner inner=outer.new Inner();//内部类
        inner.innerMethod();
        inner.accessOuterField();

    }
}
