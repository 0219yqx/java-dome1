package Math;

public class Text4 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr1 = new int[5];
//        System.arraycopy(arr, 0, arr1, 0, arr.length);//数组复制
//        for (int i : arr1) {
//            System.out.print(i+" ");
//        }
        int[] arr = {1, 2, 3, 4, 5};
        System.arraycopy(arr, 0, arr, 2, arr.length-2);//数组复制
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
