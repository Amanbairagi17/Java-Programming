package ArrayQuestion;

import java.util.Scanner;

public class Repetingnum {
    static int firstrepetingnum(int []arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[j];

                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the size  of array : ");
        int n= Sc.nextInt();
        int []arr= new int[n];

        System.out.println("Enter  "+  n +"  value of array : ");
        for(int i=0;i< arr.length;i++){
            arr[i]= Sc.nextInt();
        }
        System.out.println("Repeting number is : "+firstrepetingnum(arr));
    }
}
