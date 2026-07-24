package Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("猫");
        String text = "今天天气真好，我看到一只小猫在晒太阳，它很可爱，后来又来了两只猫。";
        System.out.println(p.matcher(text).find());
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.start() + " " + m.end()+m.group());
        }
    }
}
