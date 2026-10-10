package Stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterFrequecy {
    private static int[] solve(int[] arr){
        int[] result = new int[arr.length];

        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int num :arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        Stack<Integer> st = new Stack<>();

        for (int i= arr.length-1 ; i>=0 ; i--){

        }
        return new int[]{0};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(solve(arr));
    }
}
