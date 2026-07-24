package static123;



import java.util.ArrayList;

public class StudentText1 {
    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("John", 20,"Math"));
        students.add(new Student1("Jane", 22,"Science"));
        students.add(new Student1("Mike", 21,"English"));
        int averageAge = StudentUnit.average(students);//调用静态方法
        System.out.println("Average age of students: " + averageAge);
    }
}
