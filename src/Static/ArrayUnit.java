package Static;

import java.util.StringJoiner;

public class ArrayUnit {
    private ArrayUnit(){

    }
    public static String printArray(int[] array){
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i = 0; i < array.length; i++) {
            sj.add(String.valueOf(array[i]));
        }
        return sj.toString();
    }
    public static double getAverage(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
           double number = array[i];
           sum += number;
        }
        return sum/array.length;
    }
}
