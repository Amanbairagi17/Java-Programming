package PracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class TCSQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i=0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
//            Arrays.sort(arr);
            int res = 0;
            for(int i=1 ; i<n ; i++){
                arr[i] += arr[i-1];
                res += arr[i];
            }
            System.out.println(res);
        }
    }
}
