package Exception;

public class exceptionDemo1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
