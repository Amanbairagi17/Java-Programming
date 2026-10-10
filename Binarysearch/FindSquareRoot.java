package Binarysearch;

import java.util.Scanner;

public class FindSquareRoot {
    static int sqrt(int x ){
        int st = 0 , end = x ;
        int ans = -1 ;
        while (st<=end){
            int mid = st+(end - st )/2;
            long val = (long) mid * mid;//use long to avoid the overflow
            if (val == x) return mid ;
            else if (val < x ) {
                ans= mid ;
                st = mid+1;
            }
            else end = mid -1;
        }
        return ans ;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t!=0) {
            int x = sc.nextInt();
            System.out.println(sqrt(x));
            t--;
        }
    }
}
