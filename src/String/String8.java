package String;

public class String8 {
    public static void main(String[] args) {
        String text ="WC,你这是一个天才";
        String[]arr={"TMD","WC","CNM"};
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String start="*".repeat(word.length());//repeat方法，重复
            text = text.replace(word,start);//replace方法，替换
        }
        System.out.println(text);
    }
}
