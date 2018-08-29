# Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

# Example 1:

# Input: 16
# Output: true
# Example 2:

# Input: 5
# Output: false

class Solution:
    def isPowerOfFour(self, num):
        """
        :type num: int
        :rtype: bool
        """
        return (num & (num - 1) == 0 ) and (num > 0) and ((num - 1) % 3 == 0)

# Time: O(1)
# Space: O(1)
# Difficulty: easy