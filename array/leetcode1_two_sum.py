# Given an array of integers, return indices of the two numbers such that they add up to a specific target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.



class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dic = {}
        for idx, num in enumerate(nums):
            if num in dic:
                return [idx, dic[num]]
            else:
                dic[target - num ] = idx

Solution().twoSum(nums = [2, 7, 11, 15], target = 9)
# space: O(n)
# time: O(n)