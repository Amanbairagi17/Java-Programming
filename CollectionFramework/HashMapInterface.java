package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapInterface {
    public static void main(String[] args) {
        HashMap<Integer , String> mp = new HashMap<>();// Map is a combination of set and list (set as key , list as value)
        mp.put(1,"Aman");
        mp.put(2,"Kanha");
        mp.put(3,"Naveenn");
        mp.put(4,"Surendra");
        mp.put(5,"Love");
        mp.put(1,"Aman Bairagi");

        System.out.println(mp);
        System.out.println(mp.values());
        System.out.println(mp.get(3));//return the value associated with the key
        System.out.println(mp.remove(1));//Aman Bairagi
        System.out.println(mp);//{2=Kanha, 3=Naveenn, 4=Surendra, 5=Love}
        System.out.println(mp.containsKey(4));// true
        System.out.println(mp.containsValue("Aman"));//false -: because we replaces aman with amanbairagi then we removed it that's it not contains in map
        System.out.println(mp.size());//4
        System.out.println(mp.isEmpty());//false

        for (Iterator<Map.Entry<Integer, String>> iterator = mp.entrySet().iterator();
             iterator.hasNext();
        ) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


//        for (int num : mp.keySet()){
//            System.out.println(num +" - "+ mp.get(num));
        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


    }
}
