package Set;

import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set= new HashSet<>();
        for (int num : nums) set.add(num);
        int maxStreak = 0;

        for (int num : set){
            if (!set.contains(num-1)){// num is a starting point of a sequences
                int currNum = num;
                int currStreak =1;// length of current consecutive sequence
                while (set.contains(currNum+1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
        //Time Complexity - O(n)
        //Space Complexity - O(n)
    }
    public static void main(String[] args) {
        int [] nums = {99,100 ,1 ,4 ,2,2,3,200};
        System.out.println(longestConsecutive(nums));
    }
}
