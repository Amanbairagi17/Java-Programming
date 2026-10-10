package ArrayQuestion;

import java.util.Scanner;

public class equalSumPartition {
    static int findArraySum(int[] arr){
        int totalSum=0;
        for (int i=0;i< arr.length;i++){
            totalSum +=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartitionArray(int[] arr){
        int totalSum =findArraySum(arr);
        int prefSum=0;
        for (int i =0;i<arr.length;i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n + " values in array : ");
        for (int i= 0;i<arr.length;i++){
            arr[i]= Sc.nextInt();
        }
        System.out.println("partition : " +equalSumPartitionArray(arr));
    }
}
