package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class IODemo16 {
    public static void main(String[] args) throws Exception {

        // —— 认亲现场：你天天用的 System.out，本尊就是 PrintStream
        System.out.println("System.out 的真身 = " + System.out.getClass());  // → java.io.PrintStream

        File file = new File("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\print.txt");

        // —— 自己 new 一个字节打印流，★传 UTF-8★（写中文不传，可能乱码，呼应前面的坑）
        //    try-with-resources 包着 → 结束自动 close → 自动 flush，文件不会空
        try (PrintStream ps = new PrintStream(new FileOutputStream(file), true, "UTF-8")) {

            ps.println(97);          // 排版成 "97"，不是字母 a！🖨️（对比复印机 write(97)）
            ps.println(3.14);        // 排版成 "3.14"
            ps.println(true);        // 排版成 "true"
            ps.println("你好，世界");  // 字符串原样排版，UTF-8 编码写出去，不乱码
            // 注意：上面这些 println 全都不用 try-catch —— 因为 PrintStream 把异常吞了🤫
        }

        // 打开 print.txt 看看：97 / 3.14 / true / 你好，世界 —— 全是你眼睛想看到的样子 ✅
    }
}