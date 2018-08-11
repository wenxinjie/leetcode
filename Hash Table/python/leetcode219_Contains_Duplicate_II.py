# Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

# Example 1:

# Input: nums = [1,2,3,1], k = 3
# Output: true
# Example 2:

# Input: nums = [1,0,1,1], k = 1
# Output: true


class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dic = {}
        n = len(nums)
        for i in range(n-1):
            dic[nums[i]] = i 
            if nums[i+1] in dic:
                if i+1 - (dic[nums[i+1]]) <= k:
                    return True
        return False

# Time: O(n)
# Space: O(n)
# Difficulty: easy