package Static.abstract2;

public class Outer {
    private String outerField="外部类字段";
    private static String staticField="静态字段";
    public class Inner {
        private String innerField = "内部类字段";

        public void innerMethod() {
            System.out.println(outerField);
            System.out.println(staticField);
            System.out.println(innerField);
        }

        public void accessOuterField() {
            System.out.println(Outer.this.outerField);
        }
    }
//        public void outerMethod(){
//            Inner inner=new Inner();
//            inner.innerMethod();
//
//    }
}
