# Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

# Example:

# Given array nums = [-1, 2, 1, -4], and target = 1.

# The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        res = []
        for i in range(n-2):
            p1 = i + 1
            p2 = n - 1            
            if nums[i] + nums[p1] + nums[p1 + 1] > target:
                res.append(nums[i] + nums[p1] + nums[p1 + 1])
            elif nums[i] + nums[p2] + nums[p2 - 1] < target:
                res.append(nums[i] + nums[p2] + nums[p2 - 1])
            else:
                while p1 < p2:
                    res.append(nums[i] + nums[p1] + nums[p2])
                    if nums[i] + nums[p1] + nums[p2] < target:
                        p1 += 1
                    elif nums[i] + nums[p1] + nums[p2] > target:
                        p2 -= 1
                    else:
                        return target
        res.sort(key = lambda x :abs(x - target))
        return res[0]

# Time: O(n^2)
# Space: O(n)
# Difficulty: medium