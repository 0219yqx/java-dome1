package Static.abstract3;

public class Outer {
    private static int a = 10;
    private int b = 21;
    public void test(){
        System.out.println(a);//
    }
    class Inner{
        static int  a = 20;
        public static void test(){
            int a = 30;
            System.out.println(a);//30
            System.out.println(Inner.a);//20
            Outer outer = new Outer();
            System.out.println(outer.a);//10
        }
    }
}
