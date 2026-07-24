package Pattern;

public class Demo7 {
    public static void main(String[] args) {
//        需求1：判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        String[] test = {"a123a", "b456b", "17891", "&abc&"};
        String regex="(.).+\\1";//(.)捕获一个字符，.+表示任意多个字符，\\1表示第一个括号匹配的内容（即第一个捕获的字符
        for(int i=0;i<test.length;i++){
            System.out.println(test[i].matches(regex));
        }
//        需求2：判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        String[] test1={"abc123abc", "b456b", "123789123", "&!@abc&!@"};
        String regex1="(.+).+\\1";//(.+).+\\1表示第一个括号捕获任意多个字符，.+表示任意多个字符，\\1表示第一个括号匹配的内容（即第一个捕获的字符串
        for(int i=0;i<test1.length;i++){
            System.out.println(test1[i].matches(regex1));
        }
//         需求3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也要一致
        String[] test2={"aaa123aaa","bbb112211bbb"};
        String regex2="((.)\\2*).*\\1";//\\2*表示第二个括号捕获的内容重复任意次，\\1表示第一个括号匹配的内容（即第一个捕获的字符串
        for(int i=0;i<test2.length;i++){
            System.out.println(test2[i].matches(regex2));
        }
    }
}
