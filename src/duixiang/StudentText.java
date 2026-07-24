package duixiang;

public class StudentText {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("001", "张三", 18);
        students[1] = new Student("002", "李四", 19);
        students[2] = new Student("003", "王五", 20);
        int count = 3;
        count = addStudent(students, "004", "赵六", 21, count);
        showStudent(students, count);
        count = delStudent(students, "002", count);
        showStudent(students, count);
        updateStudentAge(students, "003",count);
        showStudent(students, count);
    }


    public static int addStudent(Student[] students, String id, String name, int age, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {

                System.out.println("学号重复");
                return count;
            }
        }
        students[count] = new Student(id, name, age);
        System.out.println("添加成功");
        return count + 1;

    }

    public static void showStudent(Student[] students, int count) {
        for (int i = 0; i < count; i++)
            System.out.println(students[i].getId() + " " + students[i].getName() + " " + students[i].getAge());
    }

    public static int delStudent(Student[] students, String id, int count) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("学号不存在");
            return count;
        }
        for (int i = index; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[count - 1] = null;
        System.out.println("删除成功");
        return count - 1;
    }

    public static void updateStudentAge(Student[] students, String id, int count) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                students[i].setAge(students[i].getAge() + 1);
                System.out.println("学生"+students[i].getName()+"年龄已更新为"+students[i].getAge());
                return;
            }
        }
        System.out.println("学号不存在");
    }
}




