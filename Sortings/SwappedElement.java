package Sortings;

import java.util.Scanner;

public class SwappedElement {
    static void Display(int []arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sortArray(int [] arr){
        int n = arr.length;
        int x=-1 , y=-1;
        for (int i=1 ; i<n ; i++){
            if (arr[i-1] > arr[i]){
                if (x==-1){
                    x=i-1;
                    y=i;
                }
                else {
                    y=i;
                }
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of array : ");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        Display(arr);
    }
}