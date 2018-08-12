
# Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

# Example:

# Input:  [1,2,1,3,2,5]
# Output: [3,5]
# Note:

class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        xor = 0
        for num in nums:
            xor ^= num
        
        xor = xor & ~ (xor - 1)
        res = [0,0]
        for num in nums:
            if xor & num == 0:
                res[0] ^= num
            else:
                res[1] ^= num
        return res

# Time: O(n)
# Space: O(1)
# Difficulty: medium