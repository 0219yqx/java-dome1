package Math;

public class Text3 {
    public static void main(String[] args) {

        System.out.println("看看我输出了吗");
//        System.exit(0);//退出程序
        long start = System.currentTimeMillis();
        for(int i=2;i<=10000;i++){
            if(isPrime(i))
                System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end-start)+"毫秒");
    }
    public static boolean isPrime(int num){
        for(int i=2;i<=10000;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}