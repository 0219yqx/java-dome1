package heima;

public class hj5 {
/**
 * 主方法，演示一个数组处理并生成数字的过程
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 初始化一个整型数组
    int []arr = {1,9,8,3};
    // 第一个循环：将数组每个元素加5
    for(int i=0;i<arr.length;i++){
        arr[i]=arr[i]+5;
    }
    // 第二个循环：将数组每个元素对10取模
    for(int i=0;i<arr.length;i++){
        arr[i]=arr[i]%10;
    }
    // 第三个循环：反转数组元素
    for(int i=0,j=arr.length-1;i<j;i++,j--){
        // 使用临时变量交换元素
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // 第四个循环：将数组元素组合成一个数字
    int number=0;
    for(int i=0;i<arr.length;i++){

        number=number*10+arr[i];

    }
    // 输出最终结果
    System.out.println(number);
    }

}
