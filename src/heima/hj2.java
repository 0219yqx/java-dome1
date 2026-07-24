package heima;
import java.util.Scanner;
public class hj2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        System.out.println("请选择仓位：经济舱1或商务舱2");
        int position = sc.nextInt();
        int price=0;
        if (month >= 5 && month <= 10) {
             price=getticketPrice(800,position,0.8,0.5);
        } else if ((month >= 1 && month <=4) ||( month > 10 && month <= 12)) {
             price=getticketPrice(1200,position,0.8,0.5);
        }else{
            System.out.println("输入错误");
        }
        System.out.println("您的票价为："+price);
    }
    public static int getticketPrice(int price,int position,double salehot,double salecold){
        if(position == 1){
            return (int) (price * salehot);
        }else if(position == 2){
            return (int) (price * salecold);
        }else{
            System.out.println("输入错误");
        }
        return 0;
    }
}