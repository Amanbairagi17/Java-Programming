package ArraySheet;

import java.util.Arrays;

public class MinSumOfNonDecreasing {
    public static void main(String[] args) {
        int[] arr = {5,3,1,8,4,2,9,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for(int i=0 ; i< arr.length ; i+=2){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
