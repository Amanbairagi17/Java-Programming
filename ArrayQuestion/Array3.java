package ArrayQuestion;

import java.util.Scanner;

public class Array3 {

    static int findSecondMin(int [] arr){
        int min =findMin(arr);
        int n = arr.length;
        for (int i =0;i<n;i++){
            if (arr[i] == min)
                arr[i]=Integer.MAX_VALUE;
        }
        int secMin = findMin(arr);
        return secMin;
    }
    static int findMin(int [] arr){
        int min=Integer.MAX_VALUE;
        int n= arr.length;
        for (int i =0;i<n;i++){
            if(arr[i]< min)
                min=arr[i];
        }
        return min;
    }
    static int firstRepeatednum(int [] arr){
        for (int i =0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
    static int secondMax(int [] arr) {
         int max=findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        int secMax = findMax(arr);
        return secMax;

    }
    static int findMax(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
       }
        return max;
    }
    static int findUnique(int[] arr  ){
        int n = arr.length;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
               if (arr[i] == arr[j]) {
                   arr[i] = -1;
                   arr[j] = -1;
               }
            }
        }

        int ans =-1;
        for (int i =0;i<n;i++){
            if(arr[i]>0)
                ans=arr[i];
        }
        return ans;
    }
    static int triplateSum(int[] arr, int target){
        int n = arr.length;
        int ans=0;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j]+ arr[k] == target)
                        ans++;
                }
            }
        }
        return ans ;
    }
    static int  pairSum(int[] arr,int target ){
        int n = arr.length;
        int ans=0;
        for (int i =0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr [i]+arr [j]==target  )
                    ans++;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int n = Sc.nextInt() ;

        int []arr= new int[n];
        for (int i =0 ;i< arr.length;i++){
            arr[i]=Sc.nextInt();
        }
       // System.out.println("Enter a number for finding Pair of sum " );
       // int target = Sc.nextInt();
        //  System.out.println(pairSum(arr,target));
//        System.out.println("Enter a number fot finding triplet of sum ");
//        int target=Sc.nextInt();
//        System.out.println(triplateSum(arr,target));

//        System.out.println("Enter a element for find unique ");
////        int unique = Sc.nextInt();
//        System.out.println(findUnique(arr));
////        System.out.print("maximum number is : " + findMax(arr));
////        System.out.print("Second Maximum number is : " +secondMax(arr));
        System.out.print("First non repeated value is : " +firstRepeatednum(arr));
//        System.out.println("Minimun number is : " +findMin(arr));
//        System.out.println("Second Minimum number is : " +findSecondMin(arr));

    }
}
