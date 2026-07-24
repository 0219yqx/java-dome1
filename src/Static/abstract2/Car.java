package Static.abstract2;

public class Car {
    public String name;
    public int price;
    public void show(){
        Engine engine=new Engine();
        engine.show1();
        engine.show();
    }
    class Engine{
        public String type;
        public int power;
        public void show(){
            System.out.println(type+" "+power);
        }
        public void show1(){
            System.out.println(name+" "+price);
        }
    }
}
