# You are given an n x n 2D matrix representing an image.

# Rotate the image by 90 degrees (clockwise).

# Note:

# You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

# Example 1:

# Given input matrix = 
# [
#   [1,2,3],
#   [4,5,6],
#   [7,8,9]
# ],

# rotate the input matrix in-place such that it becomes:
# [
#   [7,4,1],
#   [8,5,2],
#   [9,6,3]
# ]

class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        row = 0
        while row < n-row:
            for i in range(row,n-row-1):
                matrix[row][i],matrix[i][n-1-row],matrix[n-1-row][n-i-1],matrix[n-i-1][row] = 
                matrix[n-i-1][row],matrix[row][i], matrix[i][n-1-row], matrix[n-1-row][n-i-1]
            row += 1


# Time: O(n^2)
# Space: O(1)
# Difficulty: medium        