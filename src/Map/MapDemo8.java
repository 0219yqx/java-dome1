package Map;

import java.util.TreeMap;

public class MapDemo8 {
    public static void main(String[] args) {
        String S = "aababcabcdabcde";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(k).append(" (").append(v).append(") "));
        System.out.println(sb);


    }
}