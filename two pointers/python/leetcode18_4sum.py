# Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

# Note:

# The solution set must not contain duplicate quadruplets.

# Example:

# Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

# A solution set is:
# [
#   [-1,  0, 0, 1],
#   [-2, -1, 1, 2],
#   [-2,  0, 0, 2]
# ]

class Solution:
    def fourSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        nums.sort()
        n = len(nums)
        result = set()
        i = 0
        while i < n -3:
            n1 = nums[i]
            j = i + 1
            while j < n-2:
                n2 = nums[j]
                point1 = j+1
                point2 = n-1 
                while point1 < point2 :
                    value = nums[i] + nums[j] + nums[point1] + nums[point2]
                    if value == target:
                        result.add((nums[i],nums[j],nums[point1],nums[point2]))
                        point1 += 1
                        point2 -= 1
                    if value > target:
                        point2 -= 1
                    elif value < target:
                        point1 += 1
                while j < n - 1 and (n2 == nums[j] or nums[i] + nums[j] + nums[n-2] + nums[n-1] < target) :
                    j += 1
            while i < n - 2 and ( n1 == nums[i] or nums[i] + nums[n-3] + nums[n-2] + nums[n-1] < target):
                i += 1
        return [ list(i) for i in result]

# Time: O(n^3)
# Space: 
# Difficulty: medium


