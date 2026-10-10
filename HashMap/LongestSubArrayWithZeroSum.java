package HashMap;

import java.util.HashMap;

public class LongestSubArrayWithZeroSum {
    public static int MaxLen(int[] arr, int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int prefSum=0 , maxLength=0;
        for (int i=0 ; i<arr.length ; i++){
            prefSum+=arr[i];
            if (mp.containsKey(prefSum)){
                maxLength=Math.max(i-mp.get(prefSum),maxLength);
            }else {
                mp.put(prefSum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10};
        int k =MaxLen(arr,arr.length);
        System.out.println(k);
    }
}
