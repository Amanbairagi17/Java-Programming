package ArrayQuestion;

import java.util.Scanner;

public class PresentQuerry {
    static int [] makefrequencyArray(int []arr){
        int[] freq = new int[100005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n =Sc.nextInt();
        int []arr = new int [n];
        System.out.println("Enter " + n+ " value of array : ");
        for (int i=0;i< args.length;i++){
            arr[i]= Sc.nextInt();
        }
        int[] freq =makefrequencyArray(arr);

        System.out.println("Enter number of query : ");
        int q = Sc.nextInt();

        while(q >0){
            System.out.println("Enter the number of searched : ");
            int val=Sc.nextInt();
            if (freq[val]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
