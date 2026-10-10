package ArraySheet;

public class LongestLengthOfDecreasingSubArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,4};
        int maxLength=1;
        int currlength = 1;

        for(int i=1 ; i< arr.length ; i++){
            if(arr[i] < arr[i-1]) currlength++;
            else currlength=1;
            maxLength = Math.max(maxLength,currlength);

        }
        System.out.println(maxLength);
    }
}
