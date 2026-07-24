package Math;

public class Text2 {
    public static void main(String[] args) {

       int PrimeNumber = 13;
       System.out.println(isPrime(PrimeNumber));

    }
    public static boolean isPrime(int number){
        int count=0;
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number%i==0)
                return false;
            count++;
        }
        System.out.println(count);
        return true;
    }
}
