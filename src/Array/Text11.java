package Array;

public class Text11 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        String[]arr1={"java","c", "c++"};
        printArray(arr);
        printArray(arr1);
    }
    public static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.print(t+" ");
        }
        System.out.println();
    }
}
