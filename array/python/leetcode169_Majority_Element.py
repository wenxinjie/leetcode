# Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

# You may assume that the array is non-empty and the majority element always exist in the array.

# Example 1:

# Input: [3,2,3]
# Output: 3
# Example 2:

# Input: [2,2,1,1,1,2,2]
# Output: 2


class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cnt = 1
        cur = nums[0]
        for i in range(1, len(nums)):
            if cnt == 0:
                cur = nums[i]
            if nums[i] != cur:
                cnt -= 1;
            else:
                cnt += 1
                    
        return cur
        
# Time: O(n)
# Space: O(1)
# Difficulty: easy