package ArraySheet;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;

public class PracticeSet1 {
    private static int sumOfArray(int[] arr){
        int sum = 0;
//        for(int num : arr) sum += num;
//        return sum;

         sum = Arrays.stream(arr).sum();
         return sum;
    }

    private static float average(int[] arr){
        int n = arr.length;
        int sum = Arrays.stream(arr).sum();
        float avg = (float)sum /n;
        return avg;
    }

    private static ArrayList<Integer> minMax(int[] arr){
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];

        for (int num : arr){
            if(min > num) min = num;
            if(max < num) max = num;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);

        return list;

    }

    private static boolean linearSearch(int[] arr, int x){
        for (int i=0 ; i<arr.length ; i++){
            if(x == arr[i]) return true;
        }
        return false;
    }

    private static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int num : arr){
            if(num == x) count++;
        }
        return count;
    }
    private static void replaceOccurrences(int[] arr, int n, int x){
        for(int i=0 ;i<arr.length ; i++){
            if(arr[i] == n) arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isContains(int[] arr, int n){
        for(int num : arr){
            if(num == n) return true;
        }
        return false;
    }

    private static int[] countOddEven(int[] arr){
        int n = arr.length;
        int odd = 0, even = 0;

        for(int num : arr){
            if(num % 2 == 0) even++;
            else  odd++;
        }
        int[] oddArr = new int[odd];
        int[] evenArr = new int[even];
        int e= 0;
        int o=0;

        for(int i=0 ; i<n ; i++){
            if(arr[i] % 2 == 0) evenArr[e++] = arr[i];
            else  oddArr[o++] = arr[i];
        }
        System.out.println(Arrays.toString(oddArr));
        System.out.println(Arrays.toString(evenArr));
        return new int[]{odd,even};
    }

    private static ArrayList<ArrayList<Integer>> oddEvenList(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();


        for(int num : arr){
            if(num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        ans.add(even);
        ans.add(odd);
        return ans;
    }

    public static void copyElement(int[] arr){
        int n = arr.length;
        // Method 1
        int[] ans = arr.clone();
        System.out.println(Arrays.toString(ans));

        //method 2
//        int[] temp = new int[n];
//        temp = arr;
//        System.out.println(Arrays.toString(temp));

//      Method 3
//        for(int i=0 ; i<n ; i++){
//            temp[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(temp));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int n = arr1.length + arr2.length;

        int[] arr = new int[n];
        int k = 0;

        for (int i=0 ; i<arr1.length ; i++){
            arr[k++] = arr1[i];
        }
        for (int j=0 ; j<arr2.length ; j++){
            arr[k++] = arr2[j];
        }
        return arr;
    }

    private static boolean equalArray(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;

        for (int i=0 ; i<arr1.length ; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    private static int findFirstOccurrences(int[] arr, int x){
        int n = arr.length;

        for (int i=0 ; i<n ; i++){
            if(arr[i] == x)return i;
        }
        return -1;
    }
    private static int findLastOccurrences(int[] arr, int x){
        int n = arr.length;
        int occurrence = -1;

        for (int i=0 ; i<n ; i++){
            if(arr[i] == x) {
                occurrence = i;
            }
        }
        return occurrence;
    }

    private static int[] shiftLeftByOne(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for (int i=1 ; i<n ; i++){
            temp[i-1] = arr[i];
        }
        return temp;
    }
    private static int[] shiftRightByOne(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for (int i=0 ; i<n-1 ; i++){
            temp[i+1] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,5,6,7,2,4,5,5,6,7,1,1};
        // Questions no.1 of sheet
//        System.out.println(sumOfArray(arr));

        //questions no.2 of sheet
//         System.out.println(average(arr));

        // Questions no.3 of sheet
         //System.out.println(minMax(arr));

        // Questions no.4 of sheet
        // System.out.println(linearSearch(arr,3));// true
        //System.out.println(linearSearch(arr,8));//false

        //Question no.5 of sheet
        //System.out.println(countOccurrences(arr,4));

        //Questions no.6 of sheet
        //replaceOccurrences(arr,1,10);

        //Questions no.7 of sheet
        //System.out.println(isContains(arr,3)); //true
        //System.out.println(isContains(arr,11));

        //questions no.8 of sheet
        //System.out.println(Arrays.toString(countOddEven(arr)));// odd,even

        // question no.9 of sheet
//        ArrayList<ArrayList<Integer>> ans = oddEvenList(arr);
//
//        for (int i=0 ; i<2 ; i++){
//            ArrayList<Integer> temp = ans.get(i);
//            System.out.println(temp);
//        }

        //Questions no. 10 of sheet
//        copyElement(arr);

        // Questions no. 11 of sheet
//        int[] arr1 = {1,3,5,6,290,56,75};
//        int[] arr2 = {0,94,32,44,64,11,1};
//        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));

        //Question no.12 of sheet
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {1,2,3,4,5};
//        System.out.println(equalArray(arr1,arr2));

        // Questions no. 13 of sheet
//        System.out.println(findFirstOccurrences(arr,5));// 2 index
//        System.out.println(findFirstOccurrences(arr,100));// -1 index means x is not in this array

        // Question no. 14 of sheet
//        System.out.println(findLastOccurrences(arr,5));// 2 index
//        System.out.println(findLastOccurrences(arr,100));// -1 index means x is not in this array

        // Question no.15 of sheet
//        System.out.println(Arrays.toString(shiftLeftByOne(arr)));

        // Question no.16 of sheet
//        System.out.println(Arrays.toString(shiftRightByOne(arr)));


    }
}
