package heima;
import java.util.Random;
public class hj7 {
/**
 * 主方法，用于演示数组随机打乱的过程
 * @param args 命令行参数
 */
    public static void main(String[] args) {
        // 定义一个整型数组并初始化
        int[]arr={2,888,333,666,996};
        // 创建Random对象用于生成随机数
        Random r=new Random();
        // 生成一个随机索引，范围是0到数组长度-1
        int index=r.nextInt(arr.length);
        // 使用for循环遍历数组
        for (int i = 0; i < arr.length; i++) {
            // 将当前元素值保存到临时变量中
            int temp=arr[i];
            // 将随机位置的元素赋值给当前元素
            arr[i]=arr[index];
            // 将临时变量中的值（原始当前元素值）赋值给随机位置
            arr[index]=temp;

        }
        // 使用for循环遍历并打印打乱后的数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
