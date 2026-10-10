package Binarysearch;

public class RaceTrack {
    static boolean isPossible(int [] arr , int k , int dist){
        int kidsPlaces =1 ;
        int lastKid =arr[0];
        for (int i = 1 ; i< arr.length; i++){
            if (arr[i]-lastKid >= dist){
                kidsPlaces++;
                lastKid=arr[i];
            }
        }
        return kidsPlaces >= k;
    }
    static int raceTrack(int [] arr , int k ){
        if (arr.length < k ) return -1;
        int st=0 ,end=(int) 10e9;
        int ans = -1;

        while (st<= end){
            int mid=st+(end-st)/2;
            if(isPossible(arr, k , mid)){
                ans=mid;
                st=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int k = 4;

        System.out.println(raceTrack(arr,k));
    }
}
