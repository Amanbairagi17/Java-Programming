package Sortings;

import java.util.Scanner;

public class Count {
    static void Display(int []arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static  int findMax(int []arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length ; i++){
            if (arr[i]>mx)
                mx=arr[i];
        }
        return mx;
    }
    static void BasicCount(int[] arr) {// Basic count sort is unstable sorting algorithm
        int max = findMax(arr);
        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    static void CountSort(int []arr){// This is Stable Sorting means after sorting the element sequence is not change
        int n = arr.length;
        int [] output = new int[n];
        int max = findMax(arr);
        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {// Find the frequency of array
            freq[arr[i]]++;
        }
        for (int i = 1 ; i< arr.length ; i++){//Prefix sum of the frequency  array
            freq[i]+=freq[i-1];
        }
        //Find the index of each element in the original array and put into the output array
        for (int i = n-1 ; i>=0 ; i--){
            int idx = freq[arr[i]] - 1 ;
            output[idx] = arr[i];
            freq[arr[i]]--;
        }
        // Copying all element int original array
        for (int i = 0; i< arr.length ; i++){
            arr[i]=output[i];
        }

    }
    /*
    Time Complexity
    Worst Case - o(n+k)
    Average Case - o(n+k)
    Best Case - o(n+k)

    Space Complexity - 0(n+k)
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new  int[n];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        Display(arr);
        //BasicCount(arr);
        CountSort(arr);
        System.out.println("After sorting : ");
        Display(arr);


    };
}
