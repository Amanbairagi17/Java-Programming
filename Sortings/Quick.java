package Sortings;

import java.util.Scanner;

public class Quick {
    static void printArray(int [] arr){
        for (int val:arr) {
            System.out.print(val + " ");
        }
    }
    static void Swap(int[]arr, int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int Partition(int [] arr, int st , int end){
        int pivot = arr[st];
        int count=0;
        for (int i =st+1;i<=end ; i++){
            if (arr[i]<=pivot) count++;
        }
        int pivotIdx = st+count;
        Swap(arr,st,pivotIdx);
        int i = st;
        int j = end;
        while (i< pivotIdx && j >pivotIdx){
            while (arr[i]<= pivot) i++;
            while (arr[j] > pivot) j++;
            if (i<pivotIdx && j>pivotIdx){
                Swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void QuickSort(int [] arr, int st , int end){
        if(st>=end) return;
        int pi = Partition(arr, st, end);
        QuickSort(arr, st, pi-1);
        QuickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new  int[n];
        for(int i = 0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array Before sorting : ");
        printArray(arr);
        QuickSort(arr,0, arr.length-1);
        System.out.println();
        System.out.println("Array After sorting");
        printArray(arr);
    }
}
