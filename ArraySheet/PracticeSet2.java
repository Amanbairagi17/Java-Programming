package ArraySheet;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PracticeSet2 {
    private static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0 ; i<n-1; i++){
            boolean check = true;
            for (int j=0 ; j<n-i-1 ; j++ ){
                if (arr[j] > arr[j+1]) { // IF arr[j] > arr[j+1] then ascending else descending
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = false;
                }
            }
            if(check) break;
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0 ; i<n-1 ; i++){
            int minIdx = i;
            for(int j=i+1 ; j<n ; j++){
               // if(arr[j] < arr[minIdx]) minIdx=j;// Ascending order
                if(arr[j] > arr[minIdx]) minIdx=j;// Descending order
            }

            if(minIdx != i){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1 ; i<n ; i++){
            int j=i;

            while (j>0 && arr[j-1] > arr[j]){//for Ascending order change sign for descending
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void removeDuplicate(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);
        System.out.println(set);
    }

    private static void frequencyOfArrayElement(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        for (int key : mp.keySet()){
            System.out.println(key +" is : " +mp.get(key)+ " times ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,2,8,9,3,22,1,30,56};
        //Question no. 17 of sheet
        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
       // Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        //Using Comparator
//        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(temp, (a,b) -> a-b);
//        System.out.println(Arrays.toString(temp));

        // Questions no.18
//        System.out.println(Arrays.toString(arr));
//        //Using Comparator
//        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(temp, (a,b) -> b-a);
//        System.out.println(Arrays.toString(temp));
        //Question no. 20
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);
        //Question no.20
//        Arrays.sort(arr);
//        System.out.println(arr[1]);

//        Question no. 21 of sheet
        //removeDuplicate(arr);

        //Question no.22 of sheet
       // frequencyOfArrayElement(arr);





    }
}
