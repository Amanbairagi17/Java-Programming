package Stack;

import java.util.Stack;

public class prevGreater {
    public static int[] findPrevious(int [] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        int m = res.length;
        for (int i=0 ; i<n ;i++){
            while (!st.empty() && st.peek()<arr[i]) st.pop();
            if (st.empty()) res[i]=-1;
            else res[i]=st.peek();
            st.push(arr[i]);
        }
        return  res;
    }
    public static void main(String[] args) {
        int [] arr ={100,80,60,70,60,75,85};
        int []res= findPrevious(arr);
        for (int i=0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }

    }
}
