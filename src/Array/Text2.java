package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text2 {
    public static void main(String[] args) {
     List<String> Students= Arrays.asList("小米","小明","小乐");
     List<String>result=new ArrayList<>();
     for(String student:Students){
         if(student.contains("小")){
             result.add(student);
         }
     }
     System.out.println(result);
    }
}
