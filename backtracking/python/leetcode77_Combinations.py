
# Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

# Example:

# Input: n = 4, k = 2
# Output:
# [
#   [2,4],
#   [3,4],
#   [2,3],
#   [1,2],
#   [1,3],
#   [1,4],
# ]

class Solution:
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        res = [ ]
        self.helper(res, [], n, k, 1)
        return res
    
    def helper(self, res, cur, n, k, index):
        if k == 0:
            res.append(cur+[])
            return 
        for i in range(index, n+1):
            cur.append(i)
            self.helper(res, cur, n, k-1, i + 1)
            cur.pop()

Time: O(n^k)
Space: O(k * n ^ k)
Difficulty: medium