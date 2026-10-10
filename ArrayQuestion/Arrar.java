package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;
public class Arrar{
    static  void isSortedKthElement(int [] arr,int k){
        int n = arr.length;

        Arrays.sort(arr);
        int smallest = arr[k-1];
        int largest = arr[n-1-k+1];
        System.out.println(smallest);
        System.out.println(largest);
    }
    static void PrintArray( int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter element of  array : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
//        System.out.println("Original array");
//            PrintArray(arr);
//            int []arr_2 = Arrays.copyOfRange(arr,0 ,3 );
//        System.out.println("Copied array");
//            PrintArray(arr_2);
//        // changing the some values of array
//        arr_2[0]=9;
//        arr_2[1]=7;
//        System.out.println("After the change value of  Origional array");
//        PrintArray(arr);
//        System.out.println("After change the value of  Copied array");
//        PrintArray(arr_2);

        isSortedKthElement(arr,3);

        }
    }