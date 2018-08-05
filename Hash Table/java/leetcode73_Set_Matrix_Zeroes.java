//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
//
//Example 1:
//
//Input: 
//[
//  [1,1,1],
//  [1,0,1],
//  [1,1,1]
//]
//Output: 
//[
//  [1,0,1],
//  [0,0,0],
//  [1,0,1]
//]


package wenxinjie1;

import java.util.HashSet;
import java.util.Set;

public class leetcode73_Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        Set<Integer> col = new HashSet<Integer>(), row = new HashSet<Integer>();
        for(int i= 0; i < n; i++){
            for (int j = 0; j < m ; j++){
                if (matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i1: row){
            for(int j2 = 0; j2 < m; j2++){
                matrix[i1][j2] = 0;
            }
        }
        for (int j1: col){
            for(int i2 = 0; i2 < n; i2++){
                matrix[i2][j1] = 0;
            }
        }
    }
}

//Time: O(m*n)
//Space: O(1)
//Difficulty: medium  