# Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

# Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

# Note: You are not suppose to use the library's sort function for this problem.

# Example:

# Input: [2,0,2,1,1,0]
# Output: [0,0,1,1,2,2]

class Solution:
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        p0, p1, p2 = 0, 0, n-1
        while p1 <= p2:
            if nums[p1] == 1:
                p1 += 1
            elif nums[p1] == 0:
                nums[p0], nums[p1] = nums[p1], nums[p0]
                p0 += 1
                p1 += 1
            elif nums[p1] == 2:
                nums[p2], nums[p1] = nums[p1], nums[p2]
                p2 -= 1
                
# Time: O(nlog(n))
# Space: O(1)
# Difficulty: medium