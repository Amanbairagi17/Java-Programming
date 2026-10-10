package ArrayQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Extra {
    static  int[] smallestAndLargestElemrnt(int [] arr){
        Arrays.sort(arr);
        int[] ans={arr[0],arr[arr.length-1]};
        return ans;
    }
    static boolean isSorted(int [] arr){
   boolean check = true;
   for (int i =0 ;i<arr.length;i++){
       if (arr[i+1] < arr[i])
           check = false;
       break;
   }
    return check;
    }

    static int strictlyGreater(int [] arr, int x ){
        int count =0 ;
        for (int i =0; i< arr.length;i++){
            if(arr[i] > x)
                count++;
        }
        return count ;
    }
    static int lastOccurrences(int [] arr,int x){
        int lastIndex=-1;
        for (int i =0; i< arr.length;i++){
            if(x==arr[i])
                lastIndex=i;
        }
        return lastIndex;
    }

    static  int coutOccurrences(int [] arr,int x ){
        int count = 0;
        for (int i =0 ; i< arr.length;i++){
            if(arr[i]==x)
                count++;
        }
        return count;
    }
    static  void  printArray(int [] arr){
        for (int i =0 ;i< arr.length;i++){
            System.out.print(arr [i] + " ");

        }
        System.out.println();
    }
   //for find maximum value in arry;
    void maxofArray(){
        int arr[] ={6,7,8,5,4,1,2,88,76,90};

        int ans=0;
        for (int i =0 ;i< arr.length;i++){
            if (arr[i] > ans) {
                ans=arr[i];

            }
        }
        System.out.println("Max " +ans);
    }

    void findIndex(int n){
        int arr[] = {1,3,4,67,32,4,78,89,90,34};
        int ans=-1;
        for (int i=0;i<arr.length;i++) {
            if (n == arr[i]) {
                ans = i;
                break;
            }
        }
        System.out.println("Found " + n +  " at index  " + ans);
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       // System.out.println("enter number for searching ");
        System.out.println("Enter size of array ");
        int n = sc.nextInt();

        System.out.println("Enetr array values ");
        int [] arr=new int[n];

        for (int i = 0; i<arr.length;i++){
             arr[i]=sc.nextInt();
        }


        //int[] arr_2=arr.clone();
        int[]arr_2= Arrays.copyOfRange(arr,0,5);

         // int n  = sc.nextInt();
        // ArrayQuestion.Extra obj1 = new ArrayQuestion.Extra();
        // obj1.maxofArray();
        //  obj1.findIndex(n);
//        System.out.println("Original Array");printArray(arr);
//        System.out.println("Copied Array 2");printArray( arr_2);

//        arr_2 [0]=5;
//        arr_2 [1] = 90;
//
//        System.out.println("Original Array after changing ");printArray(arr);//
//        System.out.println("Copied Array after changing ");printArray(arr_2);

//        System.out.println("COUNT OF X " +coutOccurrences(arr,5));
//        System.out.println("Last Occurence of Array " +lastOccurrences(arr,5));
//        System.out.println( +strictlyGreater(arr,5) + "  Numbers are sticktly greater");
//        System.out.println(" Is Sorted " + isSorted(arr));
        int [] ans = smallestAndLargestElemrnt(arr);

        System.out.println("smallest " +ans[0]);
        System.out.println("Largest " +ans[1]);


    }
}
