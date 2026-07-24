package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MapDemo12 {
    //    public static void main(String[] args) {
//        ArrayList<String> boylist = new ArrayList<>();
//        Collections.addAll(boylist, "a（男）", "b（男）", "c（男）");
//        ArrayList<String> girllist = new ArrayList<>();
//        Collections.addAll(girllist, "d（女）", "e（女）");
//        Random random = new Random();
//        int i = random.nextInt(100)+1;
//        if(i<=70){
//            int index = random.nextInt(boylist.size());
//            System.out.println("男生"+boylist.get(index));
//        }else{
//            int index = random.nextInt(girllist.size());
//            System.out.println("女生"+girllist.get(index));
//        }
//    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        Collections.shuffle(list);
        Random random = new Random();
        int num = random.nextInt(list.size());
        ArrayList<String> boylist = new ArrayList<>();
       Collections.addAll(boylist, "a（男）", "b（男）", "c（男）");
        ArrayList<String> girllist = new ArrayList<>();
        Collections.addAll(girllist, "d（女）", "e（女）");
        if(list.get(num)==1){
            int index = random.nextInt(boylist.size());
            System.out.println("男生"+boylist.get(index));
        }else{
            int index = random.nextInt(girllist.size());
            System.out.println("女生"+girllist.get(index));
        }
    }
}
