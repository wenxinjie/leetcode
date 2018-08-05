# Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

# Example 1:

# Input: 
# [
#   [1,1,1],
#   [1,0,1],
#   [1,1,1]
# ]
# Output: 
# [
#   [1,0,1],
#   [0,0,0],
#   [1,0,1]
# ]

class Solution:
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        n,m = len(matrix),len(matrix[0])
        row, col = set(), set()
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    row.add(i)
                    col.add(j)
        for i1 in row:
            for j in range(m):
                matrix[i1][j] = 0
        for j1 in col:
            for i in range(n):
                matrix[i][j1] = 0

# Time: O(m*n)
# Space: O(1)
# Difficulty: medium           