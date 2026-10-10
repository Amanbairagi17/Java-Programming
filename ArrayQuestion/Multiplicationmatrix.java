package ArrayQuestion;

import java.util.Scanner;

public class Multiplicationmatrix {
    static  void multiply(int[][] a1,int r1,int c1, int[][] a2,int r2,int c2){
        if(c1!=r2){
            System.out.println("Invalid dimension - Multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i=0;i< r1;i++){
            for (int j=0;j<c2;j++){

                for (int k= 0;k<r2;k++){
                    mul[i][j]+= a1[i][k] * a2[k][j];
                }
            }
        }
        System.out.println(" Multiplication of two matrics :  ");
        PrintMatrix(mul);
    }

    static  void PrintMatrix(int arr [][]){
        for (int i= 0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter rows and column of matrix 1 : ");
        int r1 = Sc.nextInt();
        int c1 = Sc.nextInt();
        int[][] a1 = new int[r1][c1];
        System.out.println("Enter values of matrix 1 : ");
        for (int i=0 ;i<r1;i++){
            for (int j=0;j<c1;j++){
                a1 [i][j]= Sc.nextInt();
            }
        }
        System.out.println("Enter rows and column of matrix 2 : ");
        int r2 = Sc.nextInt();
        int c2 = Sc.nextInt();
        int[][] a2 = new int[r2][c2];
        System.out.println("Enter values of matrix 2 : ");
        for (int i=0 ;i<r2;i++){
            for (int j=0;j<c2;j++){
                a2 [i][j]= Sc.nextInt();
            }
        }
        System.out.println(" Matrix of 1 : ");
        PrintMatrix(a1);

        System.out.println(" Matrix of 2 : ");
        PrintMatrix(a2);

//        System.out.println("Multply of two matrix : ");
        multiply(a1,r1,c1,a2,r2,c2);
    }
}
