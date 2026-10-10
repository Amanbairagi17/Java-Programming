package Recursion;

import java.util.Scanner;

public class Recursion2 {
//    static void printKmultipes(int n ,int k ){
//        if (k==1) {
//            System.out.println(n);
//            return;
//        }
//        printKmultipes(n,k-1);
//        System.out.println(n*k);
//    }
//    static int seriesSum1(int n ){//Natural number series sum
//        if (n==0) return n;
//        return seriesSum1(n-1)+n;
//    }
//    static int seriesSum2(int n ){
//        if (n==0) return n ;
//        if(n%2==0)
//        return seriesSum2(n-1)-n;
//        return seriesSum2(n-1)+n;
//    }
    static  int findGCD(int n ,int k ){
        while(n%k != 0){
            int rem = n%k;
            n=k;
            k=rem;
        }
        return k;
    }
    static  int GCD(int n,int k){
        if (k == 0) return n;
        return GCD(k,n%k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        System.out.println(seriesSum2(n));
//        printKmultipes(n,k);
        System.out.println(findGCD(n,k));
        System.out.println(GCD(n,k));
        // for find the lcm -> lcm * gcd = x*y;
        int lcm = (n*k)/GCD(n,k);
        System.out.println(lcm);

    }
}
