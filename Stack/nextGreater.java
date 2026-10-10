package Stack;

import java.util.Stack;

public class nextGreater {
//    public static void nextGreaterelement(int [] arr){ // using array TC - O(n)  , SC- O(n)
//        int [] res = new int[arr.length];
//
//        for (int i=0 ; i<arr.length;i++){
//            for(int j=i+1; j< arr.length;j++){
//                res[i]=-1;
//                if (arr[i]<arr[j]){
//                    res[i]=arr[j];
//                    break;
//                }
//            }
//        }
//        for (int i=0 ; i< res.length-1;i++){
//            System.out.print(res[i]+" ");
//        }
//    }
    public static void nextGreaterelement(int [] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
//        res[n-1]=-1;
//        st.push(res[n-1]);

        for (int i=n-1 ; i>=0 ;i--){
            while (!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if (st.isEmpty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        for (int i=0 ; i< res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        nextGreaterelement(arr);
    }
}




