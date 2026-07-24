package Regular;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("------------1-----------");
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));
        System.out.println("ab".matches("[abc]"));
        System.out.println("ab".matches("[abc][abc]"));
        System.out.println("------------2-----------");
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));
        System.out.println("------------3-----------");
        System.out.println("m".matches("[a-dm-p]"));//匹配a到d，m到p之间的任意字符
        System.out.println("------------4-----------");
        System.out.println("e".matches("[a-z&&[def]]"));//匹配d，e，f
        System.out.println("&".matches("[a-z&[def]]"));//匹配&
    }
}
