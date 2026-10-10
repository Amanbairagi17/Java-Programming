package ArrayQuestion;

import java.util.Scanner;

public class Twosum {
    static int Pairsum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {//first number
            for (int j = i + 1; j < n; j++) {//second number
                for (int k =j+1;k<n;k++) {//for three sum
                    if (arr[i] + arr[j] + arr[k] == target)
                        ans++;
                }
            }
        }
        return ans;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter  " + n + "  elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter sum target");
        int target = sc.nextInt();
        System.out.println("The pairs are :" + Pairsum(arr, target));

    }
}
