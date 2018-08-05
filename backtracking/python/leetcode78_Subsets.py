# Given a set of distinct integers, nums, return all possible subsets (the power set).

# Note: The solution set must not contain duplicate subsets.

# Example:

# Input: nums = [1,2,3]
# Output:
# [
#   [3],
#   [1],
#   [2],
#   [1,2,3],
#   [1,3],
#   [2,3],
#   [1,2],
#   []


class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        if not nums or len(nums) == 0: return res
        self.helper(res, [], nums, 0)
        return res
    
    def helper(self,res,cur,nums,index):
        res.append(cur + [])
        for i in range(index, len(nums)):
            cur.append(nums[i])
            self.helper(res,cur,nums,i+1)
            cur.pop()

# Time: O(2 ^ n)
# Space: O(n * 2 ^ n)
# Difficulty: medium