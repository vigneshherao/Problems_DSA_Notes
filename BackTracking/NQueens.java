package BackTracking;

public class NQueens{
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i<board.length;i++){
            for(int j= 0;j<board.length;j++){
                board[i][j] = 'X';
            }
        }


        placeQueens(board,0);

    }

    public static void placeQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
           
        }

        for(int j=0;j<board.length;j++){
           if(isSafeToPlaceQueen(board,row,j)){
                board[row][j] = 'Q';
                placeQueens(board,row+1);
                board[row][j] = 'X';
           }
        }

    }

    public static boolean isSafeToPlaceQueen(char[][] board,int row,int col){

        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i = row-1,j = col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i = row-1,j = col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("----------------------------------------");
        for(int i = 0; i<board.length;i++){
            for(int j= 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}