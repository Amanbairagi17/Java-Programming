package PriorityQueue;

import java.util.*;

public class KthSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of List : ");
        int n= sc.nextInt();

        System.out.println("Enter "+n+" elements in the list : ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0;i<n;i++){
            nums.add(sc.nextInt());
        }
        System.out.println("Enter Kth number : ");
        int k = sc.nextInt();
//        Collections.sort(nums,Collections.reverseOrder());
//        int k = sc.nextInt();
//        System.out.println(nums.get(k-1));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<n;i++){
            pq.add(nums.get(i)); // Add element

            if (pq.size() > k) {
                pq.poll(); // Remove smallest element
            }
        }
        System.out.println(pq.peek());
    }
}
