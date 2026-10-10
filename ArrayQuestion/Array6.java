package ArrayQuestion;

import java.util.Scanner;

public class Array6 {
    static int [] makePrefixSum(int [] arr){//arrays sum with using another array
        int n = arr.length;
        int [] pref = new int[n];
        pref [0]=arr[0];
        for (int i =1 ;i < n; i++){
            pref[i]= pref[i-1] +arr[i] ;
        }
//        int j =1;
//        while(j<n){
//            pref[j]=arr[j]+ pref[j-1];
//            j++;
//        }
        return pref;
    }
    static int [] makePrefixSumArray(int [] arr){//arrays sum without using another array
        int n= arr.length;
        for (int i=1; i< n ; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    static int findArraysSum(int [] arr){
        int totalSum= 0;
        for (int i= 0; i< arr.length; i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int [] arr){
        int n= arr.length;
        int  totalSum = findArraysSum(arr);
        int prefSum=0;
        for (int i =0 ; i < n ; i++){
            prefSum+=arr[i];
            int suffixSum = totalSum-prefSum;
            if (prefSum==suffixSum)
                return true;
        }
        return false;
    }
    static void printArray(int [] arr){
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
//        int [] arr = new int[n+1];// 1 based indexing
//        System.out.println("Enter values in array : ");
//        for (int i=1;i<=n;i++){
//            arr[i] = sc.nextInt();
//        }
        int [] arr = new int[n];// 0 based indexing
        System.out.println("Enter values in array : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        printArray(arr);
//        int [] pref = makePrefixSum(arr);
//       int [] pref = makePrefixSumArray(arr);
//        printArray(arr);
//        System.out.println("Enter no. of queries : ");
//        int q = sc.nextInt();

//        while (q-->0){
//            System.out.println("Enter the value of l & r : ");
//            int l= sc.nextInt();
//            int r = sc.nextInt();
//            int  ans = pref[r]-pref[l-1];
//            System.out.println(ans);
//        }
        System.out.println(equalSumPartition(arr));

    }
}
