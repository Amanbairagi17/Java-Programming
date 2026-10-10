package Binarysearch;

import java.util.Scanner;

public class Findfirstandlastoccurence {
    static int[] findElement(int [] arr , int k ){
        int [] result = {-1,-1};
        result[0]=findLeftBound(arr,k );
        result[1]=findRightBound(arr,k);
        return result;
    }
    static int findLeftBound(int [] arr , int target ){
        int n = arr.length;
        int st = 0 ,end = n-1;
        int index = -1 ;
        while (st<= end ){
            int mid = st +(end - st )/2;
            if (arr[mid]==target){
                index= mid;
                end = mid-1;
            }
            else if (arr[mid]>target) end = mid-1;
            else st=mid+1;
        }
        return index;
    }
    static int findRightBound(int [] arr , int target ){
        int n = arr.length;
        int st = 0 ,end = n-1;
        int index = -1 ;
        while (st<= end ){
            int mid = st +(end - st )/2;
            if (arr[mid]==target){
                index= mid;
                st=mid+1;
            }
            else if (arr[mid]>target) end = mid-1;
            else st=mid+1;
        }
        return index;
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
        int [] ans = findElement(arr,k);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
