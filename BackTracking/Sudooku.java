package BackTracking;

public class Sudooku {
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        placeElements(sudoku,0,0);
    }
    public static void placeElements(int[][] sudoku,int row,int col){

        if (row == 9) {
            printSudoku(sudoku);
            return;
        }

        if (col == 9) {
            placeElements(sudoku, row + 1, 0);
            return;
        }

        if (sudoku[row][col] != 0) {
            placeElements(sudoku, row, col + 1);
            return;
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                placeElements(sudoku, row, col + 1);
                sudoku[row][col] = 0; // Backtrack
            }
        }
    }

    public static boolean isSafe(int[][] sudoku,int row,int col,int digit){

        for(int i = 0; i<sudoku.length;i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }


        for(int i = 0; i<sudoku[0].length;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }


        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i = sr;i<sr+3;i++){
            for(int j = sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }



    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
