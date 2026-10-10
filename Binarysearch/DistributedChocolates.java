package Binarysearch;

import java.util.Scanner;

public class DistributedChocolates {
    static boolean isDivisionPossible(int [] arr , int m , int mxChocolateAllowed){
        int NoS=1;
        int choc=0;
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i]>mxChocolateAllowed) return false;
            if (choc+arr[i]<=mxChocolateAllowed){
                choc+=arr[i];
            }
            else {
                NoS++;
                choc=arr[i];
            }
        }
        return (NoS>m ? false : true);
    }
    static int distributedChocolates(int [] arr , int m ){
        if (arr.length < m) return -1;
        int ans = 0 ,st = 1 , end = (int) 10e9;
        while (st <= end){
            int mid = st+(end-st)/2;
            if(isDivisionPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of the array : ");
        for (int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no of students : ");
        int m = sc.nextInt();
        System.out.println(distributedChocolates(arr,m));

    }
}
