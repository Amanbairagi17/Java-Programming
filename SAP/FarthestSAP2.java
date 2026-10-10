package SAP;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FarthestSAP2 {
//    private static int solve1(int x,int k, int[] arr){
//        int sum = 0;
//        int n = arr.length;
//
//        Arrays.sort(arr);
//        int i=0;
//        for (int j=0; j<n ; j++){
//
//        }
//
//
//    }
    private static int solve(int x, int k, int [] arr){
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(Math.abs(a-x) > Math.abs(b-x) ) return +1;
            return -1;
        });

        for (int i=0 ; i< arr.length ; i++){
            pq.add(arr[i]);
            if(pq.size() > k) pq.poll();
        }

        while(!pq.isEmpty()){
            int num = pq.poll();
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(x,k,arr));
       // System.out.println(solve1(x,k,arr));
    }
}
