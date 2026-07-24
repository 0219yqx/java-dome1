package String;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() % 2 == 0) {
            String start = str.substring(0, str.length() / 2);
            String end = str.substring(str.length() / 2);
            if (start.equals(new StringBuilder(end).reverse().toString())) {
                System.out.println("YES,是回文数，回文数为" + str);
            } else {
                System.out.println("NO,不是回文数");
            }
        }else {
            String start = str.substring(0, (str.length() - 1) / 2);
            String end = str.substring((str.length() +1)/ 2 );
            if (start.equals(new StringBuilder(end).reverse().toString())) {
                System.out.println("YES,是回文数，回文数为" + str);
            } else {
                System.out.println("NO,不是回文数");
            }
        }
    }
}
