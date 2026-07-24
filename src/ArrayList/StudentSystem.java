package ArrayList;

import java.util.Scanner;
import java.util.ArrayList;


public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Studentms> arrayList = new ArrayList<>();
        loop:
        while (true) {//循环标记
            System.out.println("-------欢迎来到学生管理系统--------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出系统");
            System.out.println("请输入你的选择：");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    addStudent(arrayList);
                    break;
                case "2":
                    deleteStudent(arrayList);
                    break;
                case "3":
                    updateStudent(arrayList);
                    break;
                case "4":
                    viewStudent(arrayList);
                    break;
                case "5":
                    System.out.println("退出系统");
                    break loop;
                default:
                    System.out.println("输入有误，请重新输入");

            }
        }
    }

    public static void addStudent(ArrayList<Studentms> array) {
        Scanner scanner = new Scanner(System.in);
        Studentms s = new Studentms();
        while (true) {
            System.out.println("请输入学生学号：");
            String id = scanner.next();
            if (isExist(array, id)) {//判断学号是否存在
                System.out.println("学号已存在，请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }
            System.out.println("请输入学生姓名：");
            String name = scanner.next();
            System.out.println("请输入学生年龄：");
            int age = scanner.nextInt();
            System.out.println("请输入学生地址：");
            String address = scanner.next();

            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            array.add(s);

            System.out.println("添加学生成功");

    }

    public static void deleteStudent(ArrayList<Studentms> array) {
        if(array.size() == 0){
            System.out.println("当前无学生信息，请添加后重试");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = scanner.next();
        for(int i = 0; i < array.size(); i++){
            Studentms s = array.get(i);
            if(s.getId().equals(id)){
                array.remove(i);
                System.out.println("删除学生成功");
                return;
            }
        }
        System.out.println("查无此人");
    }

    public static void updateStudent(ArrayList<Studentms> array) {
        if(array.size() == 0){
            System.out.println("当前无学生信息，请添加后重试");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String id = scanner.next();
        for(int i = 0; i < array.size(); i++) {
            Studentms s = array.get(i);
            if (s.getId().equals(id)){//判断学号是否存在
                System.out.println("请输入学生姓名：");
                String name = scanner.next();
                System.out.println("请输入学生年龄：");
                int age = scanner.nextInt();
                System.out.println("请输入学生地址：");
                String address = scanner.next();
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                System.out.println("修改学生成功");
                return;
            }
        }
    }

    public static void viewStudent(ArrayList<Studentms> array) {
        if (array.size() == 0) {
            System.out.println("当前无学生信息，请添加后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t地址");
        for (int i = 0; i < array.size(); i++) {
            Studentms s = array.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }

    public static boolean isExist(ArrayList<Studentms> array, String id) {
        if (array.size() == 0) {
            return false;
        }
        for (int i = 0; i < array.size(); i++) {
            Studentms s = array.get(i);
            if (s.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

}
