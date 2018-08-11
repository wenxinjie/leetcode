# Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

# Note:

# All numbers will be positive integers.
# The solution set must not contain duplicate combinations.
# Example 1:

# Input: k = 3, n = 7
# Output: [[1,2,4]]
# Example 2:

# Input: k = 3, n = 9
# Output: [[1,2,6], [1,3,5], [2,3,4]]


class Solution:
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        res = []
        nums = list(range(1,10))
        self.helper(res, [], k, n, nums, 0);
        return res
    
    def helper(self, res, cur, k, n, nums, index):
        # print(nums)
        if n < 0 or not nums: return 
        if k == 0 and n == 0:
            res.append(cur+[])
            return
        for i in range(index, len(nums)):
            cur.append(nums[i])
            self.helper(res, cur, k-1, n-nums[i],nums, i+1)
            cur.pop()

# Time: O(n^k)
# Space: O(n * n^k)
# Difficulty: medium