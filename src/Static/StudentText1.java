package Static;

public class StudentText1 {
    public static void main(String[] args) {
        Student1.teacherName="lrb";
        Student1 student = new Student1();

        student.setName("张三");
        student.setAge(18);
        student.setGender("男");
       student.study();
        student.show();
        Student1 student1 = new Student1();
        student1.setName("李四");
        student1.setAge(20);
        student1.setGender("女");

        student1.study();
        student1.show();
    }
}
