package ArraySheet;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {3,2,-2,4};
        int n = arr.length;

//        int[] pref = new int[arr.length];
//        pref[0] = arr[0];
//
//        for(int i=1 ; i<n ; i++){
//            pref[i-1] += arr[i];
//        }
//
//        int[] suff = new int[arr.length];
//        suff[arr.length-1] = arr[arr.length];
        long total = 1;
        long ans = 0;
        for(int i=0 ; i<n ; i++){
            total = total * arr[i];
        }
        for(int num : arr){
            ans = total/num;
            System.out.println(ans);
        }




    }
}
