
# Given a 32-bit signed integer, reverse digits of an integer.
# Example 1:
# Input: 123
# Output: 321

# Example 2:
# Input: -123
# Output: -321

# Example 3:
# Input: 120
# Output: 21

class Solution:
    def reverse(self, x):
        """
            :type x: int
            :rtype: int
            """
        res, sign, x = 0, -1 if x < 0 else 1, abs(x)
        while x:
            res = res * 10 + x % 10
            x //= 10
        if sign > 0:
            if res > 2 ** 31 - 1 :
                return 0
        elif sign < 0:
            if res > 2 ** 31 :
                return 0
        return res * sign

# time: O(1)
# space: O(1)
# difficulty: easy
