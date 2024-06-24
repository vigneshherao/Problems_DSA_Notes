package BinarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        int row = 0;
        int col = matrix[0].length-1;


        while(row<=matrix.length-1 && col>=0){

            if(matrix[row][col]== target){
                System.err.println("found at " + row + " and "+ col);
                return;
            }
            else if(target<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
    }
}
