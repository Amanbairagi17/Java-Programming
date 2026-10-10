package College;

import java.util.Arrays;

public class Sorting {
    private static  void insertionSort(int[] arr){
        int n = arr.length;

        for (int i=1 ; i<n ; i++){
            int j=i;

            while (j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    private static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            int minIdx = i;
            for(int j=i+1 ; j<n ; j++){
//                if(arr[j] < arr[minIdx]) minIdx = j; // for ascending order
                if(arr[j] > arr[minIdx]) minIdx = j; // for descending order
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

    }
    private static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){
            boolean check = true;
            for(int j=1 ; j<n-i-1 ; j++){
                if(arr[j-1] < arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    check = false;
                }
            }
            if(check) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
