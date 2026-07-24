package Algorithm;

import java.util.Arrays;

public class Text5 {
    //选择排序
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36, 13, 19, 16, 20, 7, 10, 43, 50, 48};
        int n = arr.length;
        // 外层循环，每次确定最小元素的位置
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // 内层循环，在未排序部分查找最小值
            for (int j = i + 1; j < n; j++) {
                // 找到更小的元素时更新最小值索引
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // 交换当前元素与最小元素
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // 输出排序后的数组
        System.out.println(Arrays.toString(arr));
    }
}