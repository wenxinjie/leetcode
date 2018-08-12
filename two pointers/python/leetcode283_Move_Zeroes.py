# Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

# Example:

# Input: [0,1,0,3,12]
# Output: [1,3,12,0,0]


class Solution:
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        p1 = 0
        for i in range(len(nums)):
            if (nums[i] != 0):
                nums[i], nums[p1] = nums[p1], nums[i]
                p1 += 1

# Time: O(n)
# Space: O(1)
# Difficulty: easy        