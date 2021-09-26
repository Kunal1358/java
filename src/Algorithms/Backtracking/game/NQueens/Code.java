package Algorithms.Backtracking.game.NQueens;

public class Code {

    public static void placeQueens(int n){
        int board[][]=new int[n][n];
        placeQueensHelper(board,0,n);
    }

    public static void placeQueensHelper(int board[][],int row,int n){

        if(row==n) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]+ " ");
                }
            }
            System.out.println();
        }
            for(int j=0;j<n;j++){
                if(isBoardSafe(board,row,j)){
                    board[row][j]=1;
                    placeQueensHelper(board,row+1,n);
                    board[row][j]=0;
                }
            }
        }

    private static boolean isBoardSafe(int board[][],int row,int col){

        int n=board.length;
        for(int i=row-1,j=col-1;i>=0 && j>=0; j--,i--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row+1,j=col+1;i<n && j<n; j++,i++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n; i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=row+1,j=col-1;i<n && j>=0; i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i=row-1;i>=0;i--){
            if(board[i][col]==1){
                return false;
            }
        }
        for(int i=row+1;i<n;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        placeQueens(4);
    }

}
