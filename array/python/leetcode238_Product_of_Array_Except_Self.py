
# Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input:  [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).


class Solution:
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        num1 = [1 for _ in range(len(nums))]
        num2 = [1 for _ in range(len(nums))]
        
        for i in range(1,len(nums)):
            num1[i] = num1[i-1] * nums[i-1]
            num2[~i] = num2[~(i-1)] * nums[~(i-1)] 

        for i in range(len(nums)):
            num1[i] = num1[i] * num2[i]
        return num1

# Time: O(n)
# Space: O(n)
# Difficulty: medium