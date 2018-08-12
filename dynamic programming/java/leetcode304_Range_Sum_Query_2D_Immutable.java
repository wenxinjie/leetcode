//Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
//
//
//Example:
//Given matrix = [
//  [3, 0, 1, 4, 2],
//  [5, 6, 3, 2, 1],
//  [1, 2, 0, 1, 5],
//  [4, 1, 0, 1, 7],
//  [1, 0, 3, 0, 5]
//]
//
//sumRegion(2, 1, 4, 3) -> 8
//sumRegion(1, 1, 2, 2) -> 11
//sumRegion(1, 2, 2, 4) -> 12

package wenxinjie3;

public class leetcode304_Range_Sum_Query_2D_Immutable {
    public int[][] dp;
    public void NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i= 0; i < m; i++){
            for(int j = 0; j < n; j++){
                dp[i+1][j+1] = dp[i+1][j] + dp[i][j+1] + matrix[i][j] - dp[i][j];
            }
        }
        this.dp = dp;       
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return this.dp[row2 + 1][col2 + 1] - this.dp[row2 + 1][col1] - this.dp[row1][col2 + 1] + this.dp[row1][col1];
    }
	
}


//Time: O(m * n)
//Space: O(m * n)
//Difficulty: medium