package Static;

public class ArrayUnitText1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str=ArrayUnit.printArray(array);
        System.out.println(str);
        double[] array1 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double aver = ArrayUnit.getAverage(array1);
        System.out.println(aver);
    }
}
