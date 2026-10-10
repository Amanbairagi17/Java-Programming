package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public  class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(8);
        q.add(6);
        q.add(4);
        q.add(3);
        // -> rear  3 4 6 8 1 -> front
        Queue<Integer> helper = new ArrayDeque<>();
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.poll());
        }
        while (helper.size()>0){
            q.add(helper.poll());
        }
        System.out.println();
        System.out.println(q);
    }
}
