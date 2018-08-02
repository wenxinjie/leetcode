# Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

# Note:

# The solution set must not contain duplicate triplets.

# Example:

# Given array nums = [-1, 0, 1, 2, -1, -4],

# A solution set is:
# [
#   [-1, 0, 1],
#   [-1, -1, 2]
# ]


class Solution(object):
    def threeSum(self, nums):
        n, res = len(nums), []
        nums.sort()
        for i in range(n-2):
            if i > 0 and nums[i] == nums[i-1] : continue
            low, high, target = i+1, n-1, 0-nums[i]
            while low < high : 
                if nums[low] + nums[high] == target : 
                    res.append([nums[low],nums[high],nums[i]])
                    while low < high and nums[low] == nums[low+1]: low += 1
                    while low < high and nums[high] == nums[high-1]: high -= 1
                    low += 1
                    high -= 1
                elif nums[low] + nums[high] > target:
                    high -= 1
                else:
                    low += 1
        return res


# Time: O(n^2)
# Space: O(n)
# Difficulty: medium