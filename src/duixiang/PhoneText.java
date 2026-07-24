package duixiang;

public class PhoneText {
    public static void main(String[] args) {
        Phone [] p = new Phone[3];
        Phone p1 = new Phone("苹果","红色",9999);
        Phone p2 = new Phone("华为","黑色",8888);
        Phone p3 = new Phone("小米","白色",7777);
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        int price = 0;
        for (int i = 0; i < p.length; i++) {
            price += p[i].getPrice();
        }
        System.out.println("平均价格为"+price/3);

    }
}
