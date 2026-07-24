package StudentText;

import java.util.ArrayList;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent(list, sc);
                    break;
                case "2":
                    deleteStudent(list, sc);
                    break;
                case "3":
                    updateStudent(list, sc);
                    break;
                case "4":
                    showStudent(list);
                    break;
                case "5":
                    exitSystem();
                    break;
                default:
                    System.out.println("输入错误！请重新输入！");

            }
        }
    }

    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入学生id：");
        String id = sc.next();
        if (id.isEmpty()) {
            System.out.println("学号不能为空！");
            return;
        }
        for (Student s : list) {
            if (s.getId().equals(id)) {
                System.out.println("学号已存在！");
                return;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        if (name.isEmpty()) {
            System.out.println("姓名不能为空！");
            return;
        }
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("年龄输入错误！");
            return;
        }
        System.out.println("请输入学生成绩：");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("成绩输入错误！");
            return;
        }
        Student s = new Student(id, name, age, score);
        list.add(s);
        System.out.println("添加成功！");
    }

    public static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要删除学生的id：");
        String id = sc.next();
        if (id.isEmpty()) {
            System.out.println("学号不能为空！");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                list.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
    }

    public static void updateStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入要修改学生的id：");
        String id = sc.next();
        if (id.isEmpty()) {
            System.out.println("学号不能为空！");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                System.out.println("请输入新的学生姓名：");
                String newName = sc.next();
                System.out.println("请输入新的学生年龄：");
                int newAge = sc.nextInt();
                if (newAge < 0 || newAge > 120) {
                    System.out.println("年龄输入错误！");
                    return;
                }
                System.out.println("请输入新的学生成绩：");
                int newScore = sc.nextInt();
                if (newScore < 0 || newScore > 100) {
                    System.out.println("成绩输入错误！");
                    return;
                }

                s.setName(newName);
                s.setAge(newAge);
                s.setScore(newScore);
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("没有找到学生");
    }
    public static void showStudent(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("没有学生！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t成绩");
        for (Student s : list) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getScore());
        }
    }
    public static void exitSystem() {
        System.out.println("欢迎下次再来！");
        System.exit(0);
    }
}

