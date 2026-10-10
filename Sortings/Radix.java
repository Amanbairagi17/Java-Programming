package Sortings;

import java.util.Scanner;

public class Radix {
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
    static void CountSort(int []arr,int place ){
        int n = arr.length;
        int [] output = new int[n];
        int[] freq = new int[10];

        for (int i = 0; i < arr.length; i++) {// Find the frequency of array
            freq[(arr[i]/place)%10]++;
        }
        for (int i = 1 ; i< 10 ; i++){//Prefix sum of the frequency  array
            freq[i]+=freq[i-1];
        }
        //Find the index of each element in the original array and put into the output array
        for (int i = n-1 ; i>=0 ; i--){
            int idx = freq[(arr[i]/place)%10] - 1 ;
            output[idx] = arr[i];
            freq[(arr[i]/place)%10]--;
        }
        // Copying all element int original array
        for (int i = 0; i< arr.length ; i++){
            arr[i]=output[i];
        }
    }
    static void Radixsort(int [] arr){
        int max = findMax(arr); // get maximum element from array
        for (int place = 1 ; max/place > 0 ; place *=10 ){
            CountSort(arr,place );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new  int[n];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        Display(arr);
        Radixsort(arr);
        System.out.println("After sorting : ");
        Display(arr);
    }
}
