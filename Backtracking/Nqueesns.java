package Backtracking;

public class Nqueesns {
    public static void main(String[] args) {
        int n= 4;
        char [][] board = new char[4][4];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0);
    }

    private static void nqueen(char[][] board, int row) {
        int n=board.length;
        if (row==n){
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(board[i][j]+"");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j=0;j<n;j++){
            if (isSafe(board,row,j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = '.';//Backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row,int col) {
        int n= board.length;
        //check row
        for (int j=0;j<n;j++){
            if (board[row][j]=='Q') return false;
        }
        //check row
        for (int i=0;i<n;i++){
            if (board[i][col]=='Q') return false;
        }
        int i=row;
        int j=col;
        //left up
        while (i>=0 && j<n){
            if (board[i][j]=='Q') return false;
            i--;
            j++;
        }

         i=row;
         j=col;
        //left down
        while (i<n && j<n){
            if (board[i][j]=='Q') return false;
            i++;
            j++;
        }
        i=row;
        j=col;
        //right down
        while (i<n && j>=0){
            if (board[i][j]=='Q') return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        //right up
        while (i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}
