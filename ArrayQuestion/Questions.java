package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Questions {
    static int[] SmallestandLagestelemnt(int[] arr){
        Arrays.sort(arr);
        int[] ans= {arr[0],arr[arr.length-1]};
                return ans;
    }
    static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if (arr[i]< arr[i-1])
                check=false;
        }
        return check;
    }
    static int lastoccurance(int[] arr,int x){
       int lastindex=-1;
       for (int i=0;i<arr.length;i++){
           if(arr[i]==x)
               lastindex=i;
       }
        return lastindex;
    }
    static int countOccurance(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x)
                count++;
     return count;

    }
    static int countnumber(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > x)
                count++;
        return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]arr= new int[n];

        System.out.println("enter" + n + "elements");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter X");
        int x=sc.nextInt();

//        System.out.println("total number of count is :" + countOccurance(arr,x));
//
//        System.out.println(" Last index is : " + lastoccurance(arr,x));
//        System.out.println(countnumber(arr,x));
        int[] ans =SmallestandLagestelemnt(arr);
        System.out.println("Smallest"+arr[0]);
        System.out.println("Largest"+arr[arr.length-1]);



//        System.out.println("Is sorted Array : " +isSorted(arr));

    }
}
