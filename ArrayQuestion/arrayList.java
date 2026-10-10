package ArrayQuestion;

import java.util.Arrays;

public class arrayList {
    public static class arraylist{
        int [] arr = new int[5];
        int idx =0;
        int size = 0;
        void add(int element){
            if (size==arr.length){
                int [] brr = Arrays.copyOf(arr,arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr,brr.length);
            }
            arr[idx]=element;
            idx++;
            size++;
        }
        void set(int idx,int val){
            arr[idx]=val;
            size++;
        }


    }
    public static void main(String[] args) {
        arraylist l1 = new arraylist();
        l1.add(4);
        l1.add(5);
        l1.add(45);
        l1.set(2,9);
        System.out.println(l1.size);

    }
}
