package Recursion;

import java.util.Scanner;

public class Recursion1 {
//    static  void printIncreasing(int n){
//        if(n==1){
//            System.out.println(n);
//            return;
//        }
//        printIncreasing(n-1);
//        System.out.println(n);
//    }
//    static void printDecreasing(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }
//        System.out.println(n);
//        printDecreasing(n-1);
//    }
//    static long factorial(long n){
//        if (n==0) return 1;
//        return n*factorial(n-1);
//    }
//    static  int fibonacci(int n){
//        if (n==0 || n==1) return n;
////        if (n==1) return 1;
//        return fibonacci(n-1)+fibonacci(n-2);
//    }
//    static  int sumOfdigits(int n){
//        if (n>=0 && n<=9) return n;
//        return sumOfdigits(n/10)+n%10;
//    }
//    static  int countdigits(int n){
//        if (n>=0 && n<=9) return 1;
//        return countdigits(n/10)+1;
//    }
//    static int pow(int p , int q){//TC = o(q)
//        if (q==0) return 1;
//        return p* pow(p,q-1);
//    }
    static  int pow(int p , int q ){//TC = o(log q)
        if (q==0) return 1;
        int smallpow=pow(p,q/2);
        if (q%2==0){
            return smallpow * smallpow;
        }
        return p*smallpow*smallpow;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
//        printIncreasing(x);
//        printDecreasing(x);
//        System.out.println( factorial(x));
//        for (int i = 0 ; i<= x ; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//        System.out.println(sumOfdigits(x));
//        System.out.println(countdigits(x));
        System.out.println(pow(x,n));
  }
}
