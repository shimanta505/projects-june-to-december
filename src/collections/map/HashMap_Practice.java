package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap_Practice {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,1,2,1,3,0,5,4};
        Map<Integer,Integer> hash =new HashMap<>();

//        hash.put("saccha",1);
//        hash.put("sarker",2);
//        hash.put("math",5);
//
//        for(Map.Entry<String, Integer> m:hash.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
        for (int i:arr){
            if (hash.containsKey(i)){
                int prevCount = hash.get(i);prevCount++;
                hash.put(i,prevCount);
            }else {
                hash.put(i,1);
            }
        }


        int key =0, value =0;
        for(Map.Entry<Integer, Integer> m:hash.entrySet()){
            System.out.println("key "+m.getKey()+" value "+m.getValue());
            if (value<m.getValue()){
                key =m.getKey();value= m.getValue();
            }
        }
        System.out.println("number "+key+" highest value "+hash.get(key));
    }
}
