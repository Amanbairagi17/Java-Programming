package Binarysearch;

import java.util.Scanner;

public class RotatedSortedArray {
    public static int findMinimum(int [] arr){
        int st =0 , end = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (st <= end){
            int mid = st+(end-st)/2;
            if(arr[st] <=arr[mid]){
                ans=Math.min(ans,arr[mid]);
                st=mid+1;
            } else{
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }

        }
        return ans;
    }
    static int Search_(int [] arr , int target){ // for duplicates elements
        int st =0 , end = arr.length-1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid]==arr[st] && arr[mid] == arr[end]) {
                st++;
                end--;
            } else{
                if (arr[mid] <= arr[end]) {// mid to end is sorted
                    if (arr[mid]<target && arr[end]>= target) st=mid+1;
                    else end=mid-1;
                }
                else {//st to mid is sorted
                    if (arr[st] <= target && arr[mid] > target) end=mid-1;
                    else st=mid+1;
                }
            }
        }
        return -1;
    }
    static int Search(int [] arr , int target ){
        int st =0 , end = arr.length-1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if(arr[mid] == target) return mid;
            else{
                if (arr[mid] < arr[end]) {// mid to end is sorted
                    if (arr[mid]<target && arr[end]>= target) st=mid+1;
                    else end=mid-1;
                }
                else {//st to mid is sorted
                    if (arr[st] <= target && arr[mid] > target) end=mid-1;
                    else st=mid+1;
                }
            }
        }
        return -1;
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
        System.out.println("Enter the target element : ");
        int k = sc.nextInt();
        System.out.println(Search_(nums, k));
    }
}
