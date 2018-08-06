# Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

# Note: The solution set must not contain duplicate subsets.

# Example:

# Input: [1,2,2]
# Output:
# [
#   [2],
#   [1],
#   [1,2,2],
#   [2,2],
#   [1,2],
#   []
# ]

class Solution:
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        self.helper(res, [], nums, 0)
        return res
    
    def helper(self, res, cur, nums, index):
        res.append(cur + [])
        for i in range(index, len(nums)):
            if i > index and nums[i] == nums[i - 1]: continue
            cur.append(nums[i])
            self.helper(res, cur, nums, i + 1)
            cur.pop()

# Time: O(2 ^ n)
# Space: O(2 ^ n)
# Difficulty: medium