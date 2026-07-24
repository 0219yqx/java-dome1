package Array;

import java.util.stream.Stream;

public class Text5 {
    public static void main(String[] args) {
        long result = Stream.iterate(
                        new long[]{1, 1},
                        pair -> new long[]{pair[1], pair[0] + pair[1]}
                )
                .limit(12)
                .map(pair -> pair[0])// 取斐波那契数列的第12项
                .reduce((a, b) -> b) // 取最后一个（F(12)）
                .orElse(0L);// 如果没有元素，则返回0L
        System.out.println(result);
    }
}
