package ArrayQuestion;

import java.util.Scanner;

public class RotateMatrix {
    static void printMatrix(int[][] arr ){
        for (int i =0 ;i< arr.length ;i++){
            for (int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static  void transposeInPLace(int[][] matrix ,int r ,int c ){
        for (int i=0 ;i<c;i++){
            for (int j =i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i=0,j= arr.length-1;
        while (i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
    }
    static void rotate(int[][] Matrix,int r,int c){
        if (r!=c){ System.out.println("Rotation not possible : ");
        return;}
        //transpose the matrix
        transposeInPLace(Matrix,r,c);
        //reverse array
        for (int i=0;i<r;i++){
            reverseArray(Matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ele = r*c;
        System.out.println("Enter "+ ele + " value  of Matrix : ");
        int[][]  Matrix = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                Matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Print Matrix : ");
        printMatrix(Matrix);

        System.out.println("90 Degree rotate Matrix : ");
        rotate(Matrix,r,c);
        printMatrix(Matrix);
    }
}
