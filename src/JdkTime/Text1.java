package JdkTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            int num = Integer.parseInt(s);
            if(num<=0||num>10){
                System.out.println("输入错误");

            }else{
                list.add(s);
                System.out.println("输入成功");
                int sum=getSum(list);
                if(sum>10){
                    System.out.println("总和大于10");
                    break;
                }

            }
//            for(String a:list){
//                System.out.println(a);
//            }
        }


    }

    private static int getSum(ArrayList<String> list) {
        int sum=0;
        for(String s:list){
            sum+=Integer.parseInt(s);
        }
        return sum;
    }

}
