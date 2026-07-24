package heima;
import java.util.Scanner;
public class hj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        int price = sc.nextInt();
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();
        if(month>=5&&month<=10){//旺季
            System.out.println("请输入当前的舱位：经济舱1或商务舱2");
            int cangwei = sc.nextInt();
            if(cangwei==1){
                System.out.println("您的票价为："+(price*0.8));
            }else if(cangwei==2){
                System.out.println("您的票价为："+(price*0.5));
            }else{
                System.out.println("输入错误");
            }
        }else if(month>=1&&month<=4||month>=11&&month<=12){//淡季
            System.out.println("请输入当前的舱位：经济舱1或商务舱2");
            int cangwei = sc.nextInt();
            if(cangwei==1){
                System.out.println("您的票价为："+(price*0.7));
            }else if(cangwei==2){
                System.out.println("您的票价为："+(price*0.6));
            }
            }
        else{
            System.out.println("输入错误");
        }
    }

}