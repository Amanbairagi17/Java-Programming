package ArraySheet;

import java.util.HashSet;

public class LongestSubArrayDistinctElement {
    public static void main(String[] args) {
        int[] nums = {7, 1, 0, 3,4,5,6,9};

        int i=0;
        int j=0;
        int n = nums.length;;
        int maxLength = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j<n){
            while(set.contains(nums[j])) {
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);

            maxLength = Math.max(maxLength, j-i+1);

            j++;
        }
        System.out.println(maxLength);


    }
}
