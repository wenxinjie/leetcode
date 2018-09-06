# Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

# Example 1:

# Input: a = 1, b = 2
# Output: 3
# Example 2:

# Input: a = -2, b = 3
# Output: 1

class Solution:
    def getSum(self, a, b):
        """
        :type a: int
        :type b: int
        :rtype: int
        """
        MAX = 0x7FFFFFFF
        mask = 0xFFFFFFFF
        
        while b != 0:
            a, b = (a ^ b) & mask, ( (a & b) << 1 ) & mask
        
        return a if a < MAX else ~ (a ^ mask)


# Time: O(1)
# Space: O(1)
# Difficulty: easy        