package Sortings;

import java.util.Scanner;

public class Selection {
    static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0 ; i<n-1 ; i++){
            int min_index = i;
            for (int j = i+1 ; j< n ;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if (min_index!=i){
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
        int[] arr = {3,0,98,6,1,2,5};
//        int [] arr = new int[n];
//        for (int i = 0 ;i< arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
        selectionSort(arr);
        for (int i : arr){
            System.out.print(i + " ");
        }

    }
}
