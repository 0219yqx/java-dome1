package duixiang;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < cars.length; i++){

            Car c = new Car();
            System.out.println("请输入第"+(i+1)+"辆车的品牌");
            String brand = input.next();
            c.setBrand(brand);
            System.out.println("请输入第"+(i+1)+"辆车的颜色");
            String color = input.next();
            c.setColor(color);
            System.out.println("请输入第"+(i+1)+"辆车的价格");
            int price = input.nextInt();
            c.setPrice(price);
            cars[i] = c;
        }
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i].getBrand()+" "+cars[i].getColor()+" "+cars[i].getPrice());
        }
    }
}
