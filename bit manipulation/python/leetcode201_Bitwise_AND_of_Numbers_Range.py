# Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

# Example 1:

# Input: [5,7]
# Output: 4
# Example 2:

# Input: [0,1]
# Output: 0

class Solution:
    def rangeBitwiseAnd(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        diff = m ^ n
#using XOR to find the highest byte whose values are different in m and n
        diff = diff.bit_length()
        return m >> diff << diff

# Time: O(1)
# Space: O(1)
# Difficulty: easy       