package Pattern;
import java.util.regex.*;

public class Demo9 {
    public static void main(String[] args) {
        //捕获分组和非捕获分组
        //捕获分组：括号中的表达式会被捕获，可以通过$1,$2...来引用
        //非捕获分组：在括号中加上?:，表示不捕获
        String text = "cats and dogs";
        String regex = "(?:cat|dog)s"; // 非捕获分组

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("匹配到: " + matcher.group()); // 输出: cats, dogs
        }
    }
}
