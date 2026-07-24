package Static;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentText2 {
    public static void main(String[] args) {

        ArrayList<Student2> studentList = new ArrayList<>();
        studentList.add(new Student2("John", 20, "Male"));
        studentList.add(new Student2("Jane", 22, "Female"));
        studentList.add(new Student2("Bob", 21, "Male"));
        int amxAge=StudentUnit1.getMaxAge(studentList);
        System.out.println("The student with the maximum age is: " + amxAge);
    }
}
