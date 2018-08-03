# Given a collection of distinct integers, return all possible permutations.

# Example:

# Input: [1,2,3]
# Output:
# [
#   [1,2,3],
#   [1,3,2],
#   [2,1,3],
#   [2,3,1],
#   [3,1,2],
#   [3,2,1]
# ]

class Solution:
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        self.helper(res, [], nums)
        return res
    
    def helper(self, res, cur, nums):
        if len(cur) == len(nums):
            res.append(cur + [])
            return
        for i in nums:
            if i in cur:
                continue
            cur.append(i)
            self.helper(res, cur, nums)
            cur.pop()


# Time: O(n!)
# Space: O(n * n!)
# Difficulty: medium
