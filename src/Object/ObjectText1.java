package Object;

public class ObjectText1 {
    public static void main(String[] args) throws CloneNotSupportedException {

      int[] data = {1,2,3,4,5,6,7,8,9,10};
        User user1 = new User(1,"zhangsan","123456","/home/zhangsan",data);
       User user2=(User)user1.clone();//克隆对象
        int[]arr= user1.getData();
        arr[0]=100;
        System.out.println(user1);//深克隆只改变user1的data数组的第0个元素，不影响user2
        System.out.println(user2);


    }
}
