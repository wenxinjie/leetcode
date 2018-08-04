# A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

# The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

# How many possible unique paths are there?


class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        dp = [1 for _ in range(m)]
        for i in range(1,n):
            for j in range(1,m):
                dp[j] += dp[j-1]
        return dp[m-1]

# Time: O(m*n)
# Space: O(n)
# Difficulty: medium