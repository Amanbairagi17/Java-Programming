package SAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();


        int maxRight = nums[n-1];
        result.add(maxRight);

        for(int i=n-2 ; i>=0 ; i--){
            if(nums[i] >= maxRight){
                maxRight = nums[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
