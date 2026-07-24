package Array;

import java.util.Arrays;

public class Text1 {
    //    public static String toString(数组)           把数组拼接成一个字符串
//public static int binarySearch (数组, 查找的元素)  二分查找法查找元素
//public static int[] copyOf(原数组, 新数组长度)    拷贝数组
//public static int[] copyOfRange(原数组, 起始索引, 结束索引)  拷贝数组（指定范围）
//public static void fill(数组, 元素)           填充数组
//public static void sort(数组)                按照默认方式进行数组排序
//public static void sort(数组, 排序规则)        按照指定的规则排序
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));// 把数组拼接成一个字符串[1, 2, 3, 4, 5]
        System.out.println(Arrays.binarySearch(arr, 3));// 二分查找法查找元素2
        System.out.println(Arrays.binarySearch(arr, 5));// 二分查找法查找元素4
        System.out.println(Arrays.binarySearch(arr, 6));// 二分查找法查找元素5
//        当元素不存在时，binarySearch()返回：
//          负数：表示该元素"应该"插入的位置的相反数减1
        int []arr1=Arrays.copyOf(arr,6);
        System.out.println(Arrays.toString(arr1));
    }
}
