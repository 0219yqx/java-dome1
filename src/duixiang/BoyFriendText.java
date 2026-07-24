package duixiang;

public class BoyFriendText {
    public static void main(String[] args) {
        BoyFriend[] bf = new BoyFriend[4];
        BoyFriend bf1 = new BoyFriend("张三", 18, "男", "打游戏");
        BoyFriend bf2 = new BoyFriend("李四", 19, "男", "打篮球");
        BoyFriend bf3 = new BoyFriend("王五", 20, "男", "打代码");
        BoyFriend bf4 = new BoyFriend("赵六", 21, "男", "打网球");
        bf[0] = bf1;
        bf[1] = bf2;
        bf[2] = bf3;
        bf[3] = bf4;
        int sum = 0;
        for (int i = 0; i < bf.length; i++) {
            BoyFriend boyFriend = bf[i];
            sum += boyFriend.getAge();

        }
        int avg = sum / bf.length;
        System.out.println("平均年龄为：" + avg);
        for (int i = 0; i < bf.length; i++) {
            BoyFriend boyFriend = bf[i];
            if (boyFriend.getAge() < avg) {
                System.out.println("年龄小于平均年龄的男朋友有：" + boyFriend.getName());
            }
        }
    }
}
