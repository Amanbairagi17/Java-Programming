package ArrayQuestion;

import java.util.Scanner;

public class reverseArray {
    static void swapArray(int[] arr,int i,int j){
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    static void reverseArray(int[] arr,int i, int j){
//        int i=0;int j= arr.length-1;
        int n= arr.length;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[] arr,int k) {
        int n = arr.length;
        k = k % n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);

    }

    static void PrintArray(int[] arr ){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n+ " of array : ");
        for (int i=0;i<arr.length;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter k :");
        int k = Sc.nextInt();
        //        int[] arr={1,2,3,4,5,6};
//        ArrayQuestion.reverseArray(arr);
        rotateInPlace(arr,k);
        PrintArray(arr);
    }
}
