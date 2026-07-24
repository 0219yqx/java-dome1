package heima;

public class hj6 {
/**
 * 主方法，用于演示数组的反转和元素值的变换
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 6};  // 初始化一个整型数组
        //反转数组
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            //使用临时变量交换元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = 10 + arr[i];
            }
            arr[i]=arr[i]-5;
            System.out.print(arr[i]+" ");
        }

    }
}
