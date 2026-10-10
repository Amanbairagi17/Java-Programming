package ArrayQuestion;

import java.util.Scanner;

public class Array5 {//pointer problems
    static int[]  sortSquare(int [] arr){
        int n= arr.length;
        int left =0 ,right =n-1;
        int [] ans = new int[n];
        int k=0;
        while(left <= right ){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    static void  sortArrayParity(int [] arr){
        int n= arr.length;
        int left =0 , right=n-1;
        while (left < right){
            if (arr[left] % 2 == 1 && arr[right]%2==0) {
                swapArray(arr,left ,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static void sortArrayUsingPointer(int [] arr ){
        int n= arr.length;
        int left =0,right=n-1;
        while(left<right){
            if (arr[left]==1 && arr[right]==0){
            swapArray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0) {
                left++;
            }
            if (arr[right]==1){
                right--;
            }


        }
    }
    static int[] reverseArrayinplace(int[] arr){
        int n= arr.length;
        int i=0,j=n-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    static void sortArrayByZeroesOnes(int[] arr){
        int n=arr.length;
        int count =0;
        //count no. of zeros;
        for (int i=0;i<n;i++){
            if (arr[i]==0)
                count++;
        }
        for (int i=0;i<arr.length;i++){
            if(i<count )
                arr[i]=0;
            else
                arr[i]=1;
        }

    }
    static void printArray(int [] arr){
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr,int i ,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter values of Array : ");
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr);
        System.out.println("Sorted Array Parity : ");
//        sortArrayUsingPointer(arr);
//        sortArrayParity(arr);
         int[] ans =  sortSquare(arr);
         reverseArrayinplace(ans);
          printArray(ans);
    }
}