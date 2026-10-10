package PriorityQueue.lazyremoval;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMinimum {
    public static void main(String[] args) {
        int[] arr = {1,8,5,3,2,7,4,4,1};
        int k =3;
        int[] ans = new int[arr.length-k+1];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> arr[a] - arr[b]);// minimum element
        //PriorityQueue<Integer> paMax = new PriorityQueue<>((a,b) -> arr[b] - arr[a]);// maximum element


        for(int i=0 ; i< arr.length ; i++){
            pq.offer(i);

            if (i >= k - 1){
                while (!pq.isEmpty() && pq.peek() <= i-k){
                    pq.poll();
                }
            }

            if( i >= k-1) ans[i-k+1] = arr[pq.peek()];


        }
        System.out.println(Arrays.toString(ans));
    }
}
