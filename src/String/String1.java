package String;

import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        String rightUserName = "admin";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++){
            System.out.println("请输入用户名");
        String userName = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
            if(rightUserName.equals(userName)&&rightPassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else{

                System.out.println("用户名或密码错误,您还剩下"+(2-i)+"次机会");
            }if(i==2){
                System.out.println("您的机会已经用完");
            }

        }
    }
}
