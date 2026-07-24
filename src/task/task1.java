package task;

import java.util.Arrays;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 支持多行输入，直到没有输入为止
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) {
                break;
            }

            String[] parts = line.split("\\s+");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }

            // 调用归并排序
            mergeSort(arr, 0, arr.length - 1);

            // 输出排序后的结果
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

    /**
     * 分治法：分解与递归求解
     * @param arr   待排序数组
     * @param left  起始索引
     * @param right 结束索引
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // 求解：子问题足够小，仅有一个元素时自然有序
        }

        // 分解：将数组分为两半
        int mid = left + (right - left) / 2;

        // 递归求解左右子问题
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // 合并：将两个有序的子数组合并
        merge(arr, left, mid, right);
    }

    /**
     * 合并两个有序子数组
     * @param arr   原数组
     * @param left  左子数组起始索引
     * @param mid   左子数组结束索引
     * @param right 右子数组结束索引
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        // 第一步：申请空间，大小为两个已排序序列之和
        int[] temp = new int[right - left + 1];

        // 第二步：设定两个指针，最初位置分别为两个已经排序序列的起始位置
        int i = left;
        int j = mid + 1;
        int k = 0;         // 临时数组的指针

        // 第三步：比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // 重复步骤3直到某一指针超出序列尾，将另一序列剩下的所有元素直接复制到合并序列尾
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // 将合并后的序列拷贝回原数组
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
        }
    }
}


