//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
//
//Example:
//
//Input: 
//
//1 0 1 0 0
//1 0 1 1 1
//1 1 1 1 1
//1 0 0 1 0
//
//Output: 4

package wenxinjie2;

public class leetcode221_Maximal_Square {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length,  n = matrix[0].length, res = 0;
        int[][] dp = new int[m][n];       
        for(int i = 0; i < m ; i ++){
             for(int j = 0; j < n ; j++){
                 if (i == 0 || j == 0) dp[i][j] = (matrix[i][j] == '1')? 1: 0;
                 else if (matrix[i][j] == '0') dp[i][j] = 0;
                 else if (matrix[i][j] == '1'){
                     int a = Math.min(dp[i][j-1], dp[i-1][j]);
                     dp[i][j] = Math.min(dp[i-1][j-1], a) + 1;
                 }
                 res = Math.max(res, dp[i][j]);
             }
        }
        return res*res;
    }
}

//Time: O(n^2)
//Space: O(n^2)
//Difficulty: medium   