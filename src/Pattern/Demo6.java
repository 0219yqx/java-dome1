package Pattern;

public class Demo6 {
    public static void main(String[] args) {
        //public String replaceAll(String regex,String newStr)   按照正则表达式的规则进行替换
        //public String[] split(String regex):                按照正则表达式的规则切割字符串
        String text="我睡会Sdsgffg阿瓦达好awdsaf问干嘛呢";
        String result=text.replaceAll("[\\w&&[^_]]+","喜欢");
        System.out.println(result);
        String[] result1=text.split("[\\w&&[^_]]+");
        for(int i=0;i<result1.length;i++){
            System.out.println(result1[i]);
        }

    }
}
