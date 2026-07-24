package ceshi;

public class text3 {
    public static void main(String[] args) {
        String A ="asdfg";
        String B ="sdfga";
        A=reverse(A);
        System.out.println(check(A,B));

    }
    public static boolean check(String A,String B){
        if(A.length()!=B.length()){
            return false;
        }
        for(int i=0;i<A.length();i++){
            A=reverse(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }
    public static  String reverse(String str){
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;

    }
}
