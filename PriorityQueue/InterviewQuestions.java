package PriorityQueue;

import java.util.*;

public class InterviewQuestions {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Double> ans = getMedian(arr);
//        int k1 = sc.nextInt();
//        int k2 = sc.nextInt();
//        question4(arr,k1,k2);
        System.out.println(ans);
    }

    private static void question3(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) pq.add(num);

        for (int i=0 ; i<k; i++){
            int a = (int)pq.poll();
            int b = (int)pq.poll();
            pq.add(a*b);

        }
        while (pq.size()!=1) pq.poll();
        System.out.println(pq.peek());;
    }

    private static void question4(int[] arr, int k1, int k2){
       int n = arr.length;
//        Arrays.sort(arr);
        int sum=0;
//        for (int i=k1 ;i<k2-1 ;i++){
//            sum+=arr[i];
//        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr){
            pq.add(num);
            if(pq.size()>k2) pq.poll();
        }
        pq.remove();
        while (pq.size()!=k1) sum+=pq.poll();
        System.out.println(sum);
    }
    private static ArrayList<Double> getMedian(int[] arr){// T.C-O(NlogN)
        ArrayList<Double> res = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//max Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();//min Heap

        for (int num : arr){
            addNum(num,maxHeap,minHeap);
            res.add(findMedian(maxHeap,minHeap));
        }
       return res;
    }

    private static void addNum(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap){
        if(maxHeap.isEmpty() || num<=maxHeap.peek()){//first element add in the maxheap or elemrnt less then maxheap top element
            maxHeap.add(num);
        }
        else{// otherwise add in min heap
            minHeap.add(num);
        }
        if(maxHeap.size() > minHeap.size()+1){// for balancing
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    private static double findMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap){
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();// if number of elemetn is odd
        else return (maxHeap.peek()+minHeap.peek())/2.0;// number of element is even
    }


}
