# Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

# Note: You can only move either down or right at any point in time.

# Example:

# Input:
# [
#   [1,3,1],
#   [1,5,1],
#   [4,2,1]
# ]
# Output: 7
# Explanation: Because the path 1→3→1→1→1 minimizes the sum.


class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        m,n =len(grid), len(grid[0])
        dp = [0 for _ in range(n)]
        dp[0] = grid[0][0]
        for i in range(1, n):
            dp[i] = dp[i-1] + grid[0][i]
        for i in range(1, m):
            for j in range(n):
                if j == 0:
                    dp[j] += grid[i][0]
                else:
                    dp[j] = min(dp[j], dp[j-1]) + grid[i][j]
        return dp[n-1]

        # for i in range(1,n):
        #     grid[0][i] = grid[0][i-1] + grid[0][i]
        # for i in range(1,m):
        #     for j in range(n):
        #         if j == 0:
        #             grid[i][0] += grid[i-1][0]
        #         else:
        #             grid[i][j] = min(grid[i][j-1], grid[i-1][j]) + grid[i][j]
        # return grid[m-1][n-1]

# Time: O(m * n)
# Space: O(1)
# Difficulty: medium