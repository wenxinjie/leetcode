//
//Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//
//Example 1:
//
//Input:
//11110
//11010
//11000
//00000
//
//Output: 1
//Example 2:
//
//Input:
//11000
//11000
//00100
//00011
//
//Output: 3

package wenxinjie2;

public class leetcode200_Number_of_Islands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length, n = grid[0].length;
        boolean[][] seen = new boolean[m][n];       
        int cnt = 0;        
        for (int i = 0; i < m ; i ++){
            for (int j = 0; j < n; j++){
                if ( !seen[i][j] && grid[i][j] == '1') {
                    cnt += 1;
                    helper(grid, seen,i,j);
                }
            }
        }
        return cnt;
    }
    
    public void helper(char[][] grid, boolean[][] seen, int i, int j){
            if (i < 0 || i > grid.length-1 || j < 0 || j > grid[0].length-1 || seen[i][j] || grid[i][j] == '0') return;
            seen[i][j] = true;
            helper(grid, seen, i+1, j);
            helper(grid, seen, i-1, j);
            helper(grid, seen, i, j+1);
            helper(grid, seen, i, j-1);
        }
}

//Time: O(m * n)
//Space: O(m * n)
//Difficulty: medium