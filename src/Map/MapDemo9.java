package Map;

public class MapDemo9 {
    //    public static void main(String[] args) {
//        int []arr = {1, 2, 3, 4, 5};
//        int sum=getSum(arr);
//        System.out.println(sum);
//    }
//    public static int getSum(int []arr){
//        int sum=0;
//        for(int i:arr)
//            sum+=i;
//        return sum;
//    }
    public static void main(String[] args) {
        int sum = Sum(1, 2, 3, 4, 5);
        System.out.println(sum);
    }
    public static int Sum(int... arr) {//可变参数只能出现一次，不能出现多次，否则编译不通过；如果有可变参数和普通参数，可变参数必须放在最后；可变参数的本质是一个数组
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
