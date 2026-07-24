package Static.abstract2;

public interface Inter {

     default void show(){
        show3();
        System.out.println("show----接口中的默认方法");
    }
    default void show2(){
        show3();
         System.out.println("show2----接口中的默认方法");
    }
    private  void show3(){
        System.out.println("1234");
    }
}
