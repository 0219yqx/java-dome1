package Exception;

public class exceptionDemo2 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            String message=e.getMessage();//message的作用：获取异常信息
            System.out.println(message);
            System.out.println(e.toString());   //toString的作用：获取异常类名和异常信息
            e.printStackTrace();//打印异常的堆栈信息
            System.out.println(e);
            System.err.println("2");//标准错误输出流
        }
    }
}
