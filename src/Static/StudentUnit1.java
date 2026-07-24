package Static;

import java.util.ArrayList;

public class StudentUnit1 {
    private StudentUnit1(){

    }
    public static int getMaxAge(ArrayList<Student2> arr){
        int maxAge =arr.get(0).getAge();
        for(int i=1;i<arr.size();i++){
            if(arr.get(i).getAge()>maxAge){
                maxAge=arr.get(i).getAge();
            }
        }
        return maxAge;
    }
}
