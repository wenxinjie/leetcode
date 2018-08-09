
# Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

# Example 1:

# Input:
# 11110
# 11010
# 11000
# 00000

# Output: 1
# Example 2:

# Input:
# 11000
# 11000
# 00100
# 00011

# Output: 3

class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        if not grid: return 0
        m, n = len(grid), len(grid[0])
        seen = [[False for _ in range(n)] for _ in range(m)]
        
        def dfs(i,j):
            if  i < 0 or  i >= m or j < 0 or j >= n or seen[i][j] or grid[i][j] == '0':
                return 
            seen[i][j] = True
            for p in ((1,0), (-1,0), (0,-1), (0,1)):
                dfs(i+p[0], j+p[1])
        
        cnt = 0
        for i in range(m):
            for j in range(n):
                if not seen[i][j] and grid[i][j] == '1':
                    cnt += 1
                    dfs(i,j)
        return cnt

# Time: O(m * n)
# Space: O(m * n)
# Difficulty: medium
