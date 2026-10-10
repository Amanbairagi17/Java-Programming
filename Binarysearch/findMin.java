package Binarysearch;

import java.util.Scanner;

public class findMin {
    static int findMinimum(int [] arr ){
        int st = 0, end = arr.length-1;
        int n = arr.length;
        int ans = -1;
        while (st<=end){
            int mid = st+(end-st)/2;
            if (arr[mid] > arr[n-1]) st = mid+1;
            else if (arr[mid] <= arr[n-1]) {
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sie of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int [] nums = new  int[n];
        for(int i = 0 ; i< nums.length ; i++){
            nums[i]= sc.nextInt();
        }
        System.out.println(findMinimum(nums));
    }
}
