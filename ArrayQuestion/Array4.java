package ArrayQuestion;

import java.util.Scanner;

public class Array4 {//Array rotations
    static void rotateInPlace(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverseArray(arr,n-k,n);
        reverseArray(arr,0,n-k);
        reverseArray(arr,0,n);
    }
    static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] rotateArray(int[] arr ,int k ){
        int n = arr.length;
         k =k%n;
       int [] ans = new int[n];
       int j=0;
       for (int i=n-k;i<n;i++){
           ans[j++]=arr[i];
       }
       for ( int i =0;i<n-k;i++){
           ans[j++]=arr[i];

       }
       return ans;
    }
    static void swapArray(int[] arr,int i ,int j){
        int temp =arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    static int[] reverseArrayinplace(int[] arr){
        int n= arr.length;
        int i=0,j=n-1;
        while(i<j){
            swapArray(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
//    static int[] ArrayQuestion.reverseArray(int[] arr){
//        int n= arr.length;
//        int [] ans= new int[n];
//        int j=0,i=n-1;
////        for (int i = n-1;i>=0;i--){
////            ans[j++]=arr[i];
////        }
//        while (i>=0){
//            ans[j++]=arr[i];
//            i--;
//        }
//        return ans;

    static void printArray(int [] arr){
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
//        System.out.println("a : " +a+ " b : " +b);
    }
    static void swapValues(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A is : "+a);
        System.out.println("B is : "+b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enetr a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter b : ");
//        int b = sc.nextInt();
//        swapValues(a,b);
//        swapNumbers(a,b);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter values of Array : ");
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k = sc.nextInt();
//        int [] ans = ArrayQuestion.reverseArray(arr);
//        printArray(ans);
//        reverseArrayinplace(arr);
//       int [] ans = rotateArray(arr,k);
//        System.out.print ("Array after rotation : ");
        rotateInPlace(arr,k);
        printArray(arr);

    }
}
