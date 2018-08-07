# Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

# In Pascal's triangle, each number is the sum of the two numbers directly above it.

# Example:

# Input: 5
# Output:
# [
#      [1],
#     [1,1],
#    [1,2,1],
#   [1,3,3,1],
#  [1,4,6,4,1]
# ]

class Solution:
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """

        cur = [1]
        res = []
        for i in range(numRows):
            res.append(cur)
            cur1 = [1 for _ in range(len(cur)+1)]
            for j in range(1,len(cur1)-1):
                cur1[j] = cur[j] + cur[j-1]
            cur = cur1
        return res

# Time: O(n^2)
# Space: O(n^2)
# Difficulty: easy     