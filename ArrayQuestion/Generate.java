package ArrayQuestion;

import java.util.Scanner;

public class Generate {
    static void printMatrix(int[][] arr ){
        for (int i =0 ;i< arr.length ;i++){
            for (int j=0 ;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] GenerateSprialMatrix(int n){
        int topRow = 0 , bottomRow = n-1 , leftColumn = 0, rightColumn = n-1;
        int curr = 1;
        int [][] Matrix = new int[n][n];
        while(curr<=n*n){
            //topRow -> leftColumn to rightColumn
            for (int j =leftColumn;j<=rightColumn && curr <= n*n  ; j++){
                Matrix[topRow][j]=curr++;
            }
            topRow++;
            //rightColumn -> topRow to bottomRow
            for (int i = topRow;i<=bottomRow && curr <= n*n;i++){
                Matrix[i][rightColumn] = curr++;
            }
            rightColumn--;
            // bottomRow ->rightColumn to leftColumn
            for(int j =rightColumn;j>=leftColumn && curr <= n*n;j--){
                Matrix[bottomRow][j]=curr++;
            }
            bottomRow--;
            //leftColumn -> bottomRow ti topRow
            for (int i = bottomRow;i>=topRow  && curr <= n*n;i--){
                Matrix[i][leftColumn]=curr++;
            }
            leftColumn++;
        }
        return Matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int [][] Matrix = GenerateSprialMatrix(n);
        printMatrix(Matrix);
        
    }
}
