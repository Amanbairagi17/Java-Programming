package ArraySheet;

import java.util.HashMap;
import java.util.HashSet;

public class AppearsOnes {
    public static void main(String[] args) {
        int [] arr = {2,3,3,2,34,8,8,4,4,1,1,3,3,34,5};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);

        }

        for(int key : mp.keySet()) {
            if (mp.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }

//        int xor = 0;
//        for(int i : arr) xor ^= i;
//        System.out.println(xor);


    }
}
