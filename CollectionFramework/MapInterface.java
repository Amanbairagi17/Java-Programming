package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String > mp =new HashMap<>();
        mp.put(1,"Aman");
        mp.put(2,"Kanha");
        mp.put(3,"Laddu");
        //Iterating over keys in map
        for (var i : mp.values()){
            System.out.println(i);
        }
        //Iterate over key value mapping
        for (var e:mp.entrySet()) {
            System.out.println(e.getKey());
        }
//        mp.putIfAbsent(1,"Khushi");//overriding
//        System.out.println(mp);
//        System.out.println(mp.get(2));
//        System.out.println(mp.containsKey(4));//false
//        System.out.println(mp.containsValue("Laddu"));//true
//        System.out.println(mp.entrySet());
//        System.out.println(mp.values());
//        System.out.println(mp.keySet());
    }
}
