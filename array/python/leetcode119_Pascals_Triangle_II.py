# Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

# Note that the row index starts from 0.

# In Pascal's triangle, each number is the sum of the two numbers directly above it.

# Example:

# Input: 3
# Output: [1,3,3,1]


class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        res = []
        for i in range(rowIndex+1):
            res.insert(0,1)
            for j in range(1, len(res) - 1):
                res[j] = res[j] + res[j+1]
        return res

    def getRow2(self, rowIndex):

    	res = [1] + [0] * rowIndex   
        for i in range(rowIndex):
            for j in range(i+1, 0, -1):
                res[j] += res[j-1]
        return res

# Time: O(n^2)
# Space: O(k)
# Difficulty: easy