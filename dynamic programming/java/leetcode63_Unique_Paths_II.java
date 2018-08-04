//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//Now consider if some obstacles are added to the grids. How many unique paths would there be?

package wenxinjie;

public class leetcode63_Unique_Paths_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length = obstacleGrid[0].length;
        int[] res = new int[length];
        res[0] = 1;
        for (int i = 0; i < obstacleGrid.length;i++){
            for (int j = 0; j < obstacleGrid[0].length;j++){
                if (obstacleGrid[i][j] == 1){
                    res[j] = 0;
                }else if (j>0){
                    res[j] += res[j-1];
                }
            }
        }           
       return res[length-1] ;
    }
}

//Time: O(m*n)
//Space: O(n)
//Difficulty: medium