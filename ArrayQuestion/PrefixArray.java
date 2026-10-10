package ArrayQuestion;

import java.util.Scanner;

public class PrefixArray {
    static  void PrintArray(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static int[] makePrefixSumArray(int []arr){    //prefix sum with using extra array
//        int n= arr.length;
//        int[] pref = new int[n];
//        pref[0]=arr[0];
//        for (int i=1;i<n;i++){
//            pref[i]=pref[i-1]+arr[i];
//        }
//        return pref;
//    }
    static  int[] makePrefixSumArray(int[] arr){   // prefix sum array without using extra array
        int n= arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array : " );
        int n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " +n+ " value of array : ");
        for (int i=0;i< n;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Original Array : ");
        PrintArray(arr);
        System.out.println("Ptefix sum is : ");
//        int[] prefSum=makePrefixSumArray(arr);
        int [] pferSum=makePrefixSumArray(arr);
        for (int i: pferSum) {
            System.out.print(i+" ");
        }
    }
}
