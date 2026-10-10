package SAP;

import java.util.Arrays;

public class DutchNotaionFlag {
    public static void main(String[] args) {
        int [] arr = {1,1,1,0,0,2,2,1,0};
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//
//        for(int num : arr){
//            if(num == 0) count0++;
//            else if (num == 1) {
//                count1++;
//            }
//            else count2++;
//        }
//        int idx=0;
//        for(int i=0 ; i<count0 ; i++){
//            arr[idx++] = 0;
//        }
//        for(int i=0 ; i<count1 ; i++){
//            arr[idx++] = 1;
//        }
//        for(int i=0 ; i<count2 ; i++){
//            arr[idx++] = 2;
//        }
//        System.out.println(Arrays.toString(arr));
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
