package heima;

public class one {
    public static void main(String[] args) {
        int[]arr=new int[]{33,5,22,55,44};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
            }
        System.out.println(max);
        System.out.println(min);

        }
    }

