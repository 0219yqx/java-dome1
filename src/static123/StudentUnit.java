package static123;

import java.util.ArrayList;

public class StudentUnit {
    private StudentUnit(){
    }
    public static int average(ArrayList<Student1> list){
        int max= list.get(0).getAge();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() > max){
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
