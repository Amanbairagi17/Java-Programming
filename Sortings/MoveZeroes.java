package Sortings;

import java.util.Scanner;

public class MoveZeroes {
    static void moves(int []arr){
        int n =arr.length;
        for (int i = 0 ;i<n-1 ;i++){
            boolean flag= false;
            for (int j = 0;j<n-i-1 ;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        moves(arr);
        for (int i: arr) {
            System.out.println(i+ "");

        }

    }
}
