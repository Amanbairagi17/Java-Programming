// Usning Bitwise Operatot , Take arr =[2,2,2,3]

//Problem: Find element that appear ones

import java.util.HashMap;
import java.util.Scanner;

public class BitManipulation {
    private static int solve(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for (int key : mp.keySet()){
            int num = key;
            if(mp.get(num) == 1 ) return num;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }

}
