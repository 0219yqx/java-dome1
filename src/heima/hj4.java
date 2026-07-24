package heima;
import java.util.Scanner;
public class hj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
            int max=getmax(arr);
            int min=getmin(arr);
            int sum=getsum(arr);
            int avg=(sum-max-min)/(arr.length-2);
            System.out.println(avg);

    }
    public static int getmax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getmin(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int getsum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
