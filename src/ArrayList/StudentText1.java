package ArrayList;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentText1 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----欢迎来到学生管理系统------");
            System.out.println("1.登录      2.注册      3.忘记密码");
            System.out.println("请输入你的选择：");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    login(arrayList);
                    break;
                case 2:
                    register(arrayList);
                    break;
                case 3:
                    forget(arrayList);
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    public static void login(ArrayList<Student> arrayList) {
        boolean flag3 = verify(arrayList);
        if (flag3) {
            System.out.println("账户存在，请继续操作：");
        } else {
            System.out.println("该用户不存在，请去注册");
            return;
        }
        String verifyCodes = verifyCode();
        while (true) {
            System.out.println("请输入验证码：" + verifyCodes);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals(verifyCodes)) {
                System.out.println("验证码正确");
                break;
            } else {
                System.out.println("验证码错误");
            }
        }
        verifyCount(arrayList);
    }

    public static void register(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        String name;

        // 1. 验证用户名
        while (true) {
            System.out.println("请输入用户名（仅限数字和字母却不能全是数字，长度3到15）");
            name = scanner.next();
            if (isduplicated(arrayList, name)) {
                System.out.println("用户名已存在，请重新输入");
                continue;
            }
            if (!lengthiscorrect(name)) {
                System.out.println("用户名长度不正确，请重新输入");
                continue;
            }
            if (!isallnumber(name)) {
                System.out.println("用户名格式不正确，请重新输入");
                continue;
            }
            break;
        }

        // 创建对象，并先把名字存进去
        Student student = new Student();
        student.setName(name);// 存入对象

        // 2. 输入并验证密码（这里改成调用返回String的方法）
        String password;
        while (true) {
            // 获取密码（包含确认逻辑）
            password = getPassword();
            if (password != null) { // 如果密码验证通过
                student.setPassword(password); // 存入对象
                break;
            }
        }

        // 3. 输入并验证身份证号
        String idcord;
        while (true) {
            idcord = getIdcord(); // 获取身份证号
            if (idcord != null) {
                student.setIdcord(idcord); // 存入对象
                break;
            }
        }

        // 4. 输入并验证手机号
        String telephone;
        while (true) {
            telephone = getTelephone(); // 获取手机号
            if (telephone != null) {
                student.setTelephone(telephone); // 存入对象
                break;
            }
        }

        // 5. 所有信息都齐了，最后添加到集合
        arrayList.add(student);
        System.out.println("注册成功！");
    }

    public static void forget(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的用户名：");
        String name = scanner.next();
        for (Student student : arrayList) {
            if (student.getName().equals(name)) {
                System.out.println("请输入你的身份证号：");
                String idcord = scanner.next();
                if (student.getIdcord().equals(idcord)) {
                    System.out.println("请输入你的手机号：");
                    String telephone = scanner.next();
                    if (student.getTelephone().equals(telephone)) {
                        System.out.println("请输入你的新密码：");
                        String password = scanner.next();
                        System.out.println("请确定你的密码");
                        String password1 = scanner.next();
                        if (password.equals(password1)) {
                            student.setPassword(password);
                        } else {
                            System.out.println("两次密码输入不相同");
                        }
                        student.setPassword(password);
                        System.out.println("修改成功");
                        return;
                    }
                }
            }

            System.out.println("当前用户不存在，请先注册");
        }
    }

    public static boolean isduplicated(ArrayList<Student> arrayList, String name) {
        for (Student student : arrayList) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean lengthiscorrect(String name) {
        if (name.length() < 3 || name.length() > 15) {
            return false;
        }
        return true;
    }

    public static boolean isallnumber(String name) {
        int letterCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                letterCount++;
            }
        }
        return letterCount > 0;
    }

    // 【修改点1】这个方法现在返回 String (密码) 或者 null
    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码：");
        String password = scanner.next();
        System.out.println("请再次输入密码：");
        String password1 = scanner.next();

        if (password.equals(password1)) {
            return password; // 验证通过，返回密码字符串
        } else {
            System.out.println("两次密码输入不相同");
            return null; // 验证失败，返回null
        }
    }

    // 【修改点2】这个方法现在返回 String (身份证号) 或者 null
    public static String getIdcord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String idcord = scanner.next();

        if (idcord.length() != 18) {
            System.out.println("身份证号格式不对，应该为18位数");
            return null;
        }
        if (idcord.charAt(0) == '0') {
            System.out.println("身份证号开头数字不能为0");
            return null;
        }
        char lastChar = idcord.charAt(17);
        if (!(lastChar == 'X' || lastChar == 'x' || (lastChar >= '0' && lastChar <= '9'))) {
            System.out.println("身份证号最后一位只能是数字或者X或者x");
            return null;
        }
        return idcord; // 验证通过，返回身份证号字符串
    }

    // 【修改点3】这个方法现在返回 String (手机号) 或者 null
    public static String getTelephone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的手机号：");
        String telephone = scanner.next();

        if (telephone.length() != 11) {
            System.out.println("手机号格式不对，应该为11位数");
            return null;
        }
        if (telephone.charAt(0) == '0') {
            System.out.println("手机号开头数字不能为0");
            return null;
        }
        for (int i = 0; i < telephone.length(); i++) {
            if (!(telephone.charAt(i) >= '0' && telephone.charAt(i) <= '9')) {
                System.out.println("手机号只能为数字");
                return null;
            }
        }
        return telephone; // 验证通过，返回手机号字符串
    }

    public static boolean verify(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.next();
        for (Student student : arrayList) {
            if (student.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static String verifyCode() {
        String str = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(str.length());
            sb.append(str.charAt(index));
        }
        return sb.toString();
    }

    public static void verifyCount(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        for (Student student : arrayList) {
            if (student.getName().equals(name)) {
                System.out.println("请输入密码你的密码：");
                for (int i = 0; i < 3; i++) {
                    String password = scanner.next();
                    if (student.getPassword().equals(password)) {
                        System.out.println("登录成功");
                        return;
                    } else if (i < 2) {
                        System.out.println("密码错误，请重新输入,您还剩下" + (2 - i) + "次机会");
                    } else {
                        System.out.println("密码错误次数过多，账户已锁定，请联系管理员");
                    }
                }
            } else {
                System.out.println("姓名不存在");
            }
        }
    }

}
