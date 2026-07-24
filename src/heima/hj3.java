package heima;
import java.util.Random;
public class hj3 {
/**
 * 主方法，用于生成随机验证码
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个长度为52的字符数组，用于存储大小写字母
        char[] arr = new char[52];
    // 循环填充字符数组，前26个为大写字母，后26个为小写字母
        for (int i = 0; i < 52; i++) {
            if (i < 26) {
                // ASCII码65-90对应大写字母A-Z
                arr[i] = (char) (i + 65);
            } else {
                // ASCII码97-122对应小写字母a-z
                arr[i] = (char) (i + 71);
            }
        }
            // 初始化结果字符串
            String result = "";
            // 创建随机数生成器
            Random random = new Random();
            // 循环4次，每次从字符数组中随机选择一个字符
            for (int j = 0; j < 4; j++) {
                // 生成0-51之间的随机索引
                int index1 = random.nextInt(arr.length);
                // 将随机字符拼接到结果字符串
                result += arr[index1];
            }
            // 生成0-9之间的随机数字
            int num = random.nextInt(9);
            // 将随机数字拼接到结果字符串末尾
            result += num;
            // 输出最终生成的验证码

            System.out.println(result);


    }
}
