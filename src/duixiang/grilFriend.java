package duixiang;

public class grilFriend {
    private   String name;
    private     int age;
    private  String gender;
    public void setName(String a) {
        name=a;

    }
    public String getName() {
        return name;
    }
    public void setAge(int b) {
        if(b>0&&b<100) {
            age=b;
        }else {
            System.out.println("年龄不合法");
        }
    }
    public int getAge() {
        return age;
    }
    public void setGender(String c) {
        gender=c;
    }
    public String getGender() {
        return gender;
    }
    public void eat() {
        System.out.println("吃");
    }
    public void sleep() {
        System.out.println("睡");
    }
}
