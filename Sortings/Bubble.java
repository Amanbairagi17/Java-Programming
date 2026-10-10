package Sortings;

import java.util.Scanner;

public class Bubble {
    static  void bubbleSort(int [] arr){
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){
            boolean check = true;
            for(int j=0 ; j<n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    check = false;
                }
            }
            if(check) break;
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2,5,8};

        bubbleSort(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }

    }
}
