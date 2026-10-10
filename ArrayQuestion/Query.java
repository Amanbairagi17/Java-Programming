package ArrayQuestion;

import java.util.Scanner;

public class Query {
    static int[] makeprefSumArray(int[] arr){
        int n= arr.length;
        for (int i =1;i<n ;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = Sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter " +n + " values in array : ");
        for (int i= 1;i<=arr.length;i++){
            arr[i]= Sc.nextInt();
        }

        int[] prefSum=makeprefSumArray(arr);

        System.out.println("Enter queries : ");
        int q = Sc.nextInt();


        while(q-- >0){
            System.out.println("Enter l & r : ");
            int l=Sc.nextInt();
            int r=Sc.nextInt();

            int ans = prefSum[r]-prefSum[l-1];
            System.out.println("Sum " +ans);
        }
    }
}
