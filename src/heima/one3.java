package heima;
import java.util.Random;
import java.util.Arrays;
public class one3 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5};
        Random r =new Random();//创建一个随机数对象
        for(int i=0;i<arr.length;i++){
            int index=r.nextInt(arr.length);//随机生成一个索引
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 