package JdkTime;

import java.util.Scanner;

public class Text3 {
    //十进制转二进制
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.equals("0")){
                break;
            }
            try{
                int i = Integer.parseInt(s);
                System.out.println(toBinary(i));
            }catch(Exception e){
                System.out.println("输入的不是数字");
            }

            

        }
    }
    public static String toBinary(int n){
     StringBuilder sb = new StringBuilder();
     while(n>0){
         sb.append(n%2);
         n = n/2;
     }
     return sb.reverse().toString();
    }
}
