//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
//
//Example 1:
//
//Input:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]

package wenxinjie;

import java.util.ArrayList;
import java.util.List;

public class leetcode54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) return res;
        int m = matrix.length, n = matrix[0].length;
        int row1 = 0, row2 = m - 1, col1 = 0, col2 = n - 1;
        while (row1 <= row2 && col1 <= col2){
            for (int i = row1; i < col2 + 1; i ++) res.add(matrix[row1][i]);                
            row1 ++;
            for (int i = row1; i < row2+1; i++) res.add(matrix[i][col2]);
            col2 --;
            if (row1 <= row2){
                for (int i = col2; i > col1 - 1; i--) res.add(matrix[row2][i]);
                row2 -- ;
            }
            if (col1 <= col2){
                for (int i = row2; i > row1 - 1; i--) res.add(matrix[i][col1]);
                col1 ++;
            }
        }
        return res;        
    }	
}

//Time: O(m * n)
//Space: O(m * n)
//Difficulty: medium