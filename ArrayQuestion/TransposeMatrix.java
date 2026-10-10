package ArrayQuestion;

import java.util.Scanner;
public class TransposeMatrix {
    static  void transposeInPLace(int[][] matrix ,int r ,int c ){
        for (int i=0 ;i<c;i++){
            for (int j =i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static int [][] transpose(int[][] matrix,int r,int c){
        int[][] ans = new int[c][r];

        for (int i=0 ;i<c ;i++){
            for (int j =0 ;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
     return ans;
    }
    static void printMatrix(int[][] arr ){
        for (int i =0 ;i< arr.length ;i++){
            for (int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
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

//        System.out.println("Transpose Matrix : ");
//        int [][] ans = transpose(Matrix,r,c);
//        printMatrix(ans);
        System.out.println("Transpose Matrix : ");
        transposeInPLace(Matrix,r,c);
        printMatrix(Matrix);

    }
}
