package heima;

public class PhoneText {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand= "苹果";
        p.price= 8999;
        System.out.println(p.brand + " " + p.price);
        p.call();
        p.sendMessage();
    }
}
