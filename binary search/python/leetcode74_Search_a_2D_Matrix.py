# Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

# Integers in each row are sorted from left to right.
# The first integer of each row is greater than the last integer of the previous row.
# Example 1:

# Input:
# matrix = [
#   [1,   3,  5,  7],
#   [10, 11, 16, 20],
#   [23, 30, 34, 50]
# ]
# target = 3
# Output: true




class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        if not matrix:
            return False
        m, n = len(matrix), len(matrix[0])
        if m + n <=  1:
            return False
        l, r =0, m * n - 1
        while l < r:
            mid = (l + r) / 2
            if matrix[mid / n][mid % n] == target:
                return True
            elif matrix[mid / n][mid % n] > target:
                r = mid 
            elif matrix[mid / n][mid % n] < target:
                l = mid + 1
        if matrix[l / n][l % n] == target :
            return True
        else:
            return False

# Time:O(log(n))
# Space: O(1)
# Difficulty: medium