# Given an integer n, return the number of trailing zeroes in n!.

# Example 1:

# Input: 3
# Output: 0
# Explanation: 3! = 6, no trailing zero.
# Example 2:

# Input: 5
# Output: 1
# Explanation: 5! = 120, one trailing zero.

class Solution(object):
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """ 
        res = 0
        while n != 0:
            n /= 5
            res += n
        return res

# Time: O(log(n))
# Space: O(1)
# Difficulty: easy
