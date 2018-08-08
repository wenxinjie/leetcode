
# Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

# Example 1:

# Input: [2,3,-2,4]
# Output: 6
# Explanation: [2,3] has the largest product 6.
# Example 2:

# Input: [-2,0,-1]
# Output: 0
# Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums or len(nums) == 0: return 0
        else:
            res1,res2 = [0 for i in range(len(nums))], [0 for i in range(len(nums))]
            res1[0], res2[0] = nums[0], nums[0]
            for i in range(1,len(nums)):
                res2[i] = max(res1[i-1] * nums[i], res2[i-1] * nums[i], nums[i])
                res1[i] = min(res1[i-1] * nums[i], res2[i-1] * nums[i], nums[i])
            return max(res2)

# Time: O(n)
# Space: O(n)
# Difficulty: medium       