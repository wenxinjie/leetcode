# Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

# Example:

# Input: 3
# Output:
# [
#  [ 1, 2, 3 ],
#  [ 8, 9, 4 ],
#  [ 7, 6, 5 ]
# ]

class Solution:
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        res = [[0 for j in range(n)] for i in range(n)]
        row1,row2,col1,col2 = 0,n-1,0,n-1
        num = 1
        while row1<=row2 and col1<=col2:
            for k1 in range(col1,col2+1):
                res[row1][k1] = num
                num += 1
            row1 += 1
            
            for k2 in range(row1,row2+1):
                res[k2][col2] = num
                num+=1
            col2 -= 1
            
            for k3 in range(col2,col1-1,-1):
                res[row2][k3] = num
                num += 1
            row2 -= 1
            
            for k4 in range(row2,row1-1,-1):
                res[k4][col1] = num
                num += 1
            col1 += 1
        return res

# Time: O(n^2)
# Space: O(n^2)
# Difficulty: medium