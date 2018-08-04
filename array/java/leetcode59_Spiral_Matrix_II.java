//Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//
//Example:
//
//Input: 3
//Output:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//]

package wenxinjie;

public class leetcode59_Spiral_Matrix_II {
	public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int num = 1, row1 = 0, row2 = n-1, col1 = 0, col2 = n-1;
        while (col1 <= col2 && row1 <= row2){
            for (int i = col1; i < col2+1; i++){
                res[row1][i] = num;              
                num ++ ;
            }
            row1++;
            for (int i = row1; i < row2+1; i++){
                res[i][col2] = num;
                num ++ ;
            }
            col2 --;
            for (int i = col2; i > col1 - 1; i--){
                res[row2][i] = num;
                num ++ ;
            }
            row2 --;
            for (int i = row2; i > row1-1; i--){
                res[i][col1] = num;
                num ++ ;
            }
            col1 ++;
        }
        return res;
    }
}

//Time: O(n^2)
//Space: O(n^2)
//Difficulty: medium