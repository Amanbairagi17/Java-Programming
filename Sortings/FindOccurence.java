package Sortings;

import java.util.Scanner;

public class FindOccurence {
    static void Display(int [] arr){
        for (int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    static int Occurence(int [] arr, int target){
        int n = arr.length;
        int st = 0 ,end = n-1;
        int fo = -1 ;
        while (st<= end ){
            int mid = st +(end - st )/2;
            if (arr[mid]==target){
                fo= mid;
                end = mid-1;
            }
            else if (arr[mid]>target) end = mid-1;
            else st=mid+1;
        }
        return fo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the values of the array element : ");
        int [] arr = new int[n];
        for (int i = 0 ; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int k = sc.nextInt();
        int ans = Occurence(arr,k);
        System.out.println(ans);
    }
}
