package String;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(count(s));
    }
    public static int count(String s){
        if(s.length() == 0&&s== null){
            return 0;
        }
        int length=0;
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        while(i>=0&&s.charAt(i)!=' '){
            i--;
            length++;
        }
        return length;
    }
}
