package Exception;

import java.util.Scanner;

public class exceptionDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //name
        String name;
        while (true) {
            System.out.println("Enter your name");
            try {
                name = checkName(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        //age
        int age;
        while (true) {
            System.out.println("Enter your age");
            try {
                age = checkAge(scanner.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
    }
    public static String checkName(String name) throws Exception {
        if (name.length() < 3 || name.length() > 10) {
            throw new IllegalArgumentException("姓名长度要在3~10之间，你录的是「" + name + "」");
        }
        return name;
    }
    public static int checkAge(int age) throws Exception {
        if (age <18|| age >40) {
            throw new IllegalArgumentException("年龄要在18-48之间，你录的是「" + age + "」");
        }
        return age;
    }
}
