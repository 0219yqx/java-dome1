package String;

public class String7 {
    public static void main(String[] args) {
        String str ="TMD,你这是一个天才";
        String[]arr={"TMD","WC","CNM"};
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
