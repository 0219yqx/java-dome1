package PokerBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerGame {
    public static void main(String[] args) {
        ArrayList<Integer> Box = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(index, color + number);
                Box.add(index);
                index++;
            }
        }
        map.put(index, "小王");
        Box.add(index);
        index++;
        map.put(index, "大王");
        Box.add(index);
        //  System.out.println(Box);
        Collections.shuffle(Box);//打乱顺序(洗牌)
        //System.out.println(Box);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> underBox = new ArrayList<>();
        for (int i = 0; i < Box.size(); i++) {
            Integer card = Box.get(i);
            if (i >= 51) {
                underBox.add(card);
            } else if (i % 3 == 0) {
                player1.add(Box.get(i));
            } else if (i % 3 == 1) {
                player2.add(Box.get(i));
            } else {
                player3.add(Box.get(i));
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(underBox);
        lookPoker("张三", player1, map);
        lookPoker("李四", player2, map);
        lookPoker("王五", player3, map);
        lookPoker("底牌", underBox, map);


    }

    public static void lookPoker(String name, ArrayList<Integer> player, HashMap<Integer, String> map) {
        System.out.print(name + "的牌是: ["); // 稍微优化了打印格式，加上了括号
        for (int i = 0; i < player.size(); i++) {
            String card = map.get(player.get(i));
            System.out.print(card);
            if (i != player.size() - 1) {
                System.out.print(", ");
            }
        }
        // 修正瑕疵 2：这个玩家的牌打印完后，一定要换个行！
        System.out.println("]");
    }

}
