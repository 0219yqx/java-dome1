package Math;

public class Text1 {
    public static void main(String[] args) {
        // 绝对值
        int absInt = Math.abs(-10);        // 10
        double absDouble = Math.abs(-3.14); // 3.14

        // 取整方法
        double num = 3.7;
        long rounded = Math.round(num);    // 4 (四舍五入)
        double floor = Math.floor(num);    // 3.0 (向下取整)
        double ceil = Math.ceil(num);      // 4.0 (向上取整)
        double num1=-3.7;
        long rounded1 = Math.round(num1);    // -4 (四舍五入)
        double floor1 = Math.floor(num1);    // -4.0 (向下取整)
        double ceil1 = Math.ceil(num1);      // -3.0 (向上取整)

// 最值比较
        int max = Math.max(10, 20);        // 20
        int min = Math.min(10, 20);        // 10
        System.out.println(Math.pow(2, 3)); // 8,2 的 3 次方
        System.out.println(Math.pow(4,0.5));// 2.0,4 的平方根
        System.out.println(Math.sqrt(16));  // 4.0,16 的平方根
    }
}
