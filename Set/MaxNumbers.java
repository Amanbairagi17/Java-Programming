package Set;

import java.util.HashSet;

public class MaxNumbers {
    public static int MaxNumbersOnTable(int [] bags){
        HashSet<Integer> table = new HashSet<>();
        int max=0;
        for (int i=0 ; i< bags.length ; i++){
            int num = bags[i];
            if (table.contains(num)){
                table.remove(num);
            }else {
                table.add(num);
                max= Math.max(max,table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,3,2,3,2};
        System.out.println(MaxNumbersOnTable(nums));

    }
}
