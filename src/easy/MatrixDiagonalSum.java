package easy;

/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {

        /**
         * 0,0 0,2 1,1 2,1 2,2
         * 3*3 mat -> subtract middle value
         * i,i = primary diagonal
         * i, i-n-1 = secondary diagonal
         */
       int n = mat.length;
       int an = 0;
       for(int i = 0; i< n; i++){
           an += mat[i][i] + mat[i][n-1-i];
       }
       if(n %2 != 0) an -= mat[n/2][n/2];
       return an;
    }
}
