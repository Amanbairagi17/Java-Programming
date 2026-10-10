package Sortings;

import java.util.Scanner;

public class BinarySearch {
    static void Display(int [] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static boolean searchTarget(int [] arr,int target){
        int low = 0 ,high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return true;
            else if (arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    static boolean recursiveBinarySearch(int [] arr , int st , int end , int target ){
        if (st > end ) return false;
        int mid = (st+end)/2;
        if (arr[mid]== target) return true;
        else if (arr[mid] > target) {
            return recursiveBinarySearch(arr,st,mid-1,target);
        }
        else return recursiveBinarySearch(arr,mid+1 ,end,target);

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
        System.out.println("Enter the target value : ");
        int k = sc.nextInt();

        System.out.println( recursiveBinarySearch(arr,0,arr.length-1,k));

        //System.out.println(recursiveBinarySearch(arr,0, arr.length-1,k));
    }
}
