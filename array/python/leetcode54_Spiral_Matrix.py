# Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

# Example 1:

# Input:
# [
#  [ 1, 2, 3 ],
#  [ 4, 5, 6 ],
#  [ 7, 8, 9 ]
# ]
# Output: [1,2,3,6,9,8,7,4,5]


class Solution:
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix or len(matrix) == 0:
            return []
        m, n = len(matrix), len(matrix[0])
        row1, row2, col1, col2 = 0, m-1, 0, n-1
        res = []
        while row1 <= row2 and col1 <= col2:
            for i in range(col1, col2+1):
                res.append(matrix[row1][i])
            row1 += 1
            for i in range(row1, row2+1):
                res.append(matrix[i][col2])
            col2 -= 1
            if row2 >= row1:
                for i in range(col2, col1-1, -1):
                    res.append(matrix[row2][i])
                row2 -= 1
            if col2 >= col1:
                for i in range(row2, row1-1, -1):
                    res.append(matrix[i][col1])
                col1 += 1
        return res

# Time: O(m * n)
# Space: O(m * n)
# Difficulty: medium