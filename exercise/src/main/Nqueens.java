package Examproblems;

public class Nqueens {

    static int N=4;
    public static void print(int[][] board){
        for(int[] row:board){
            for (int cell:row){
                System.out.print((cell==1?"Q ":" . "));
            }
            System.out.println();
        }
    }
    public static void nqueens(){
        int[][] board=new int[N][N];
        if(solve(board,0)){   //0 row
            print(board);
        }
    }
    public static boolean solve(int[][] board,int row){
        if(row>=N){
            return true;
        }
        else {
            for (int col = 0; col < N; col++) {
                if (issafe(board, row, col)) {
                    board[row][col] = 1;
                    if (solve(board, row + 1)) {
                        return true;
                    }
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    public static boolean issafe(int[][] board,int row,int col){
        for (int i = 0; i < N; i++) {
            if(board[i][col]==1){
                return false;
            }

        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]==1){
                return  false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        nqueens();
    }
}
