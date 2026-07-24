package Exception;

public class exceptionDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = getMax(arr);
        System.out.println("Max value: " + max);
    }

    public static int getMax(int[] arr) {
        try {
            if (arr.length == 0) {
                throw new IllegalArgumentException();
            }
            return arr[arr.length - 1];
        } catch (IllegalArgumentException e) {
            System.out.println("Array is empty");
            return -1;
        } finally {
            System.out.println("Finally block executed");
        }
    }

}

