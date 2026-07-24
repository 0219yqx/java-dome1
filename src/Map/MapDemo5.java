package Map;

import java.util.*;

public class MapDemo5 {
    public static void main(String[] args) {
        String [] arr={"A","B","C","D"};
        Random r=new Random();
        ArrayList<String> ad=new ArrayList<>();
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<80;i++){
            int index=r.nextInt(arr.length);
            ad.add(arr[index]);
        }
        for(String s:ad){
            if(hm.containsKey(s)){//判断是否包含
                hm.put(s,hm.get(s)+1);
            }
            else{
                hm.put(s,1);
            }
        }
        int max = 0;
        Set<Map.Entry<String,Integer>> entrySet = hm.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
        }
        for(Map.Entry<String,Integer> entry:entrySet){
            if(entry.getValue()==max){
                System.out.println(entry.getKey()+"--"+entry.getValue());
            }
        }
        System.out.println(max);
    }

}
