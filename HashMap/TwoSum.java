package HashMap;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int [] arr , int target){
        int n = arr.length;
        int []ans = {-1};
        HashMap<Integer,Integer>mp = new HashMap<>();
        for (int i=0 ;i<n ;i++){
            int pair = target-arr[i];
            if (mp.containsKey(pair)){
                ans= new
                        int[]{i,mp.get(pair)};
                return ans;
            }
            mp.put(arr[i],i );
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
