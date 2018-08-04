//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//How many possible unique paths are there?

package wenxinjie;

public class leetcode62_Unique_Paths {
    public int uniquePaths(int m, int n) {
        int[] res = new int[m];
        res[0] = 1;
        for(int i = 0; i < n ; i ++ ){
            for (int j = 1 ; j < m ; j++){
                    res[j] += res[j-1];
            }
        }
        return res[m-1];    
    }
}

//Time: O(m*n)
//Space: O(n)
//Difficulty: medium