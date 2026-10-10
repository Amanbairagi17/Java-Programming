package ArrayQuestion;

import java.util.Scanner;

public class SecondMax {
    static int Max(int[]arr){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            if( arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int FindSecondmax(int[]arr){
        int mx=Max(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]== mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int Secondmx=Max(arr);
        return Secondmx;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter the "+ n+"  value of array : ");
        for (int i=0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Second Maximum is : "+FindSecondmax(arr));
    }

}
