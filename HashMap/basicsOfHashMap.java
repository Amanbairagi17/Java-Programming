package HashMap;

import java.util.HashMap;
import java.util.Map;

public class basicsOfHashMap {
    public static void main(String[] args) {
        //Syntax
        HashMap<String, Integer> mp = new HashMap<>();
        //Adding element
        mp.put("Aman",21);
        mp.put("Rohit",20);
        mp.put("Surendra ", 19);
        mp.put("Yash",16);
        //Getting value of key from the HashMap
        //System.out.println(mp.get("Aman"));
        //System.out.println(mp.get("Krishna"));
        //Changing / updating value of a key in HashMap
        mp.put("Aman",25);//update
        //Removing a pair from tha HashMap
//        mp.remove("Aman");
//        mp.remove("Priya");
        //Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Aman"));//true
        System.out.println(mp.containsKey("Laddu"));//false
        //Adding a new entry only if the new key doesn't exit already
        mp.putIfAbsent("Ayushi",40);/// will enter
        mp.putIfAbsent("Aman",39);//well not enter
        //Get all keys in the HashMap
        System.out.println(mp.keySet());
        //Get all values in the Hashmap
        System.out.println(mp.values());
        //Get all entries in the Hashmap
        System.out.println(mp.entrySet());
        //Traversing all entries of Hashmap - multiple Method
//        for (String key: mp.keySet()) {
//            System.out.printf("Age of %s is %d \n",key,mp.get(key));
//        }

//        for (Map.Entry<String ,Integer> e: mp.entrySet()) {
//            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());
//        }
        System.out.println();
        for (var e: mp.entrySet()) {
            System.out.printf("Age of %s is %d \n",e.getKey(),e.getValue());

        }
    }
}
