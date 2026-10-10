package SAP;

import java.util.Arrays;

public class OddEvenArrangement {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 6, 2, 7};
//        int[] result = new int[arr.length];
//        int idx = 0;// Stable in two pass
//        for(int num : arr){
//            if(num % 2 == 0){
//                result[idx++] = num;
//            }
//        }
//        for(int num : arr){
//            if(num % 2 != 0){
//                result[idx++] = num;
//            }
//        }
//        System.out.println(Arrays.toString(result));

//        for(int i=0 ; i<arr.length; i++){// Stable -O(n) one pass
//            if(arr[i] % 2 == 0){
//                int j=i;
//                while(j>0 && arr[j-1] % 2 != 0){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    j--;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] % 2 == 0) {
                left++;
            }else right--;

        }
        System.out.println(Arrays.toString(arr));

    }
}
