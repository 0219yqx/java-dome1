package ceshi;

public class BosiCat extends  Cat   {
    @Override

    public void eat() {
        System.out.println("一只名字为"+getName()+"的"+getAge()+"岁的"+"波斯猫正在吃东西");
    }
}
