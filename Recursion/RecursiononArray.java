package Recursion;

import java.util.Scanner;

public class RecursiononArray {
    static  int minimumCost(int [] arr , int n , int idx ){
        if(idx == n-1) return 0;

        int move1 = Math.abs(arr[idx]-arr[idx+1])+minimumCost(arr,n,idx+1);
        if (idx == n-2) return n-1;

        int move2 = Math.abs(arr[idx]-arr[idx+2])+minimumCost(arr,n,idx+2);

        return Math.min(move1,move2);
    }

    static int maxInArray(int [] arr, int idx){
        if (idx == arr.length-1) return arr[idx];
        int smallAns=maxInArray(arr,idx+1);
        return Math.max(smallAns,arr[idx]);
    }

    static void printArray(int [] arr , int idx){
        if (idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr,idx+1);
    }
    static int sumOfArray(int [] arr ,int idx){
        if (idx == arr.length) return 0;
//        int smallAns = sumOfArray(arr,idx+1);
        return sumOfArray(arr,idx+1)+arr[idx];
    }
    static void subsetSum(int []a , int n , int idx , int sum ){
        if(idx >= n ){
            System.out.print(sum + " ");
            return;
        }
        subsetSum(a,n,idx+1,sum+a[idx]);// include curr index
        subsetSum(a,n,idx+1,sum);// exclude curr index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {9,8,6};
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0  ;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        System.out.println(maxInArray(arr,0));
//        System.out.println(sumOfArray(arr,0));
//        printArray(arr,0);
//        subsetSum(arr,arr.length,0,0);
        System.out.println(minimumCost(arr,arr.length,0));
    }
}
