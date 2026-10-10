package FaisalMemon.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    //Map Stores key value pairs
    //Order not maintain
    //Key is unique and value can be duplicate

    public static void main(String[] args) {

        Map<String,Integer> names = new HashMap<>();
        names.put("Aman",1);
        names.put("Ram",0);
        System.out.println(names);
        for(Map.Entry<String, Integer> entry: names.entrySet()){
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
    }
}
