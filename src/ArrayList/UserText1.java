package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class UserText1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = input.next();
            System.out.println("请输入密码：");
            String password = input.next();
            System.out.println("请输入id：");
            String id = input.next();
            User u = new User(username, password, id);//创建用户对象
            list.add(u);//将对象添加到集合中
        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("请输入要查询的id：");
        String id = input1.next();
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);//获取集合中的元素
            if (u.getId().equals(id))
                System.out.println(u.getUsername() + " " + u.getPassword() + " " + u.getId());
        }
    }
}
