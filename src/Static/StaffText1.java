package Static;

public class StaffText1 {
    public static void main(String[] args) {
        Staff staff = new Staff("001", "张三", "3000");
        Cook cook = new Cook("002", "李四", "4000");
        System.out.println(staff.getId()+staff.getName()+staff.getWage());
        System.out.println(cook.getId()+cook.getName()+cook.getWage());
        staff.work();
        cook.work();
    }
}
