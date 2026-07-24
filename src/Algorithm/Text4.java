package Algorithm;

public class Text4 {
    //冒泡排序
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36, 13, 19, 16, 20, 7, 10, 43, 50, 48};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
