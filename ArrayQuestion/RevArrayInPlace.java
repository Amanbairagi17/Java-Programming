package ArrayQuestion;

import java.util.Scanner;

public class RevArrayInPlace {
    static void rotateInPlace(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,0,n-1);
    }
    static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void swapArray(int[] arr,int i ,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    static void printArray(int [] arr){
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        System.out.println("Enter k : ");
        int k = sc.nextInt();
        rotateInPlace(arr,k);
        printArray(arr);
    }
}
