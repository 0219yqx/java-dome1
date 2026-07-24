package heima;
import java.util.Random;
import java.util.Arrays;
public class one1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[]arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
        double avg=(double)sum/arr.length;
        System.out.println(avg);
        int count=0;
        for(int num:arr){
            if(num<avg){
                count++;
            }
        }
        System.out.println(count);
    }

}
