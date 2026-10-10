package Heap;

import javax.sound.midi.MidiSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class Basics {
    private static void swap(List<Integer> heap , int l , int r){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r, temp);
    }
    private static void push_in_minHeap(List<Integer> heap , int i){
        //compare wit parent node until reached correct position
        int parent = (i-1)/2;
        if(i==0 || heap.get(parent)<heap.get(i)) return;
        swap(heap,parent,i);
        push_in_minHeap(heap,parent);
    }private static void insert_in_minHeap(List<Integer> heap, int ele){
        heap.add(ele);
        int idx = heap.size()-1;
        push_in_minHeap(heap,idx);

    }
    private static void push_in_maxHeap(List<Integer> heap , int i){
        //compare wit parent node until reached correct position
        int parent = (i-1)/2;
        if(i==0 || heap.get(parent)>heap.get(i)) return;
        swap(heap,parent,i);
        push_in_maxHeap(heap,parent);
    }
    private static void insert_in_maxHeap(List<Integer> heap, int ele){
        heap.add(ele);
        int idx = heap.size()-1;
        push_in_maxHeap(heap,idx);

    }
    private static void delete_fromMinHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down_in_minheap(heap,0);
    }

    private static void push_down_in_minheap(List<Integer> heap, int idx) {
        int n = heap.size()-1;
        if (idx==n) return;
        int left = (2*idx)+1;
        int right =(2*idx)+2;
        int smallest = idx;
        if (left<=n && heap.get(left)<heap.get(smallest)){
            smallest=left;
        }
        if (right<=n && heap.get(right)<heap.get(smallest)){
            smallest=right;
        }
        if (smallest==idx) return;
        swap(heap,idx,smallest);
        push_down_in_minheap(heap,smallest);
    }
    private static void delete_fromMiaxHeap(List<Integer> heap){
        swap(heap,0,heap.size()-1);
        heap.remove(heap.size()-1);
        push_down_in_maxHeap(heap,0);
    }

    private static void push_down_in_maxHeap(List<Integer> heap, int idx) {
        int n=heap.size()-1;
        if (idx==n) return;
        int left = (2*idx)+1;
        int right =(2*idx)+2;
        int largest = idx;
        if (left<=n && heap.get(left)>heap.get(largest)){
            largest=left;
        }
        if (right<=n && heap.get(right)>heap.get(largest)){
            largest=right;
        }
        if (largest==idx) return;
        swap(heap,idx,largest);
        push_down_in_maxHeap(heap,largest);
    }
    private static void heapify(List<Integer> arr){
        int las_non_leaf_node=((arr.size()-1)-1)/2;
        for (int i=las_non_leaf_node;i>=0;i--){
            push_down_in_minheap(arr,i);
        }
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
//        System.out.println(heap);
//        insert_in_minHeap(heap,5);
//        System.out.println(heap);
//        insert_in_maxHeap(heap,70);
      //  System.out.println(heap);
       // delete_fromMinHeap(heap);
        System.out.println(heap);
//        delete_fromMiaxHeap(heap);
        heapify(heap);
        System.out.println(heap );
    }
}
