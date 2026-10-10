package Sortings;

import java.util.Scanner;

public class Sort {
    static void Display(int []arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void partition(int [] arr){
        int l =0, r=arr.length-1;
        while (l<r){
            while (arr[l]<0) l++;
            while (arr[r] >= 0 ) r--;
            if (l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp ;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of array : ");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        partition(arr);
        Display(arr);
    }
}
