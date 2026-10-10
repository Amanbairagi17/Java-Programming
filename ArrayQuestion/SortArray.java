package ArrayQuestion;

import java.util.Scanner;

public class SortArray {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void PrintArray(int [] arr){
        int n= arr.length;
        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverseArray(int[] arr){
        int i=0;int j= arr.length-1;
        int n= arr.length;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] SortSquares(int []arr){ // sort given values squares and sort it
        int n = arr.length;
        int left = 0,right = n-1;
        int [] ans = new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]* arr[left];
                left++;
            }
            else{
                ans[k++]= arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
//    static void  SortZeroesandOnes(int[] arr) {//for zeroes and ones
//        int n = arr.length;
//        int left = 0, right = n - 1;
//        while (left < right) {
//            if (arr[left] == 1 && arr[right] == 0) {
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//            if (arr[left] == 0) left++;
//
//            if (arr[right] == 1) right--;
//        }
//    }
    static  void SortArrayByParity(int[] arr){//for even and odd using single loop
        int n = arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0)left++;
            if(arr[right]%2==1)right--;
        }
    }

//    static void SortZeroesandOnes(int [] arr){// for 0 ans 1 double loop
//        int n=arr.length;
//        int count = 0;
//        for (int i=0;i<n ;i++){
//            if(arr[i]==0)
//                count++;
//        }
//        for (int i=0;i<n;i++){
//            if(i<count){
//                arr[i]=0;
//            }
//            else{
//                arr[i]=1;
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = Sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter " + n + "  values of array : ");
        for (int i=0;i< arr.length;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Original Array : ");
        PrintArray(arr);
        int []ans = SortSquares(arr);
//        SortZeroesandOnes(arr);
//        SortArrayByParity(arr);
        reverseArray(ans);
        System.out.println("Sorted Array : ");
        PrintArray(ans);
    }
}
