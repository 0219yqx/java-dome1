package duixiang;

public class GoodsText {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];
        Goods goods1 = new Goods("001","手机", 1999, 100);
        Goods goods2 = new Goods("002","电视", 2999, 50);
        Goods goods3 = new Goods("003","电脑", 3999, 30);
        goods[0] = goods1;
        goods[1] = goods2;
        goods[2] = goods3;
        for (int i = 0; i < goods.length; i++) {
            Goods good = goods[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getCount());
        }
    }
}
