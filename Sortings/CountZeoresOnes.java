package Sortings;

import java.util.Scanner;

public class CountZeoresOnes {
    static void Display(int [] num){
        for (int i : num){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    static void swap(int [] arr , int i , int  j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    static void Sort012(int [] num ){
        int low = 0 , mid = 0, high = num.length-1;
        while (mid<=high){
            if (num[mid]==0){
                swap(num,low,mid);
                low++;
                mid++;
            } else if (num[mid]==1) {
                mid++;
            } else if (num[mid]==2) {
                swap(num,high,mid);
                high--;
            }
        }
    }
    static void Count(int [] num){
        int count_0 = 0 ,count_1 = 0 , count_2 = 0 ;
        for (int j : num) {
            if (j==0) count_0++;
            else if (j==1) count_1++;
            else if (j==2) count_2++;
            }
        int k = 0;
        while (count_0>0){
            num[k++] = 0;
            count_0--;
        }
        while (count_1>0){
            num[k++] = 1 ;
            count_1--;
        }
        while (count_2>0){
            num[k++] = 2 ;
            count_2--;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int [] arr = new  int[n];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        //Count(arr);
        Sort012(arr);
        Display(arr);
    }
}
