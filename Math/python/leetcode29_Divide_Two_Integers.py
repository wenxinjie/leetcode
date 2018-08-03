
# Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

# Return the quotient after dividing dividend by divisor.

# The integer division should truncate toward zero.

# Example 1:

# Input: dividend = 10, divisor = 3
# Output: 3
# Example 2:

# Input: dividend = 7, divisor = -3
# Output: -2


# recursive solution, saving more time
class Solution(object):
    def divide(self, dividend, divisor):
        """
        :type dividend: int
        :type divisor: int
        :rtype: int
        """
        if (dividend > 0 and divisor > 0)  or (dividend < 0 and divisor < 0):
            flag = 1
        else:
            flag = -1
        dend, visor = abs(dividend), abs(divisor)
        q = self.helper(dend, visor)
        if flag > 0:
            return min( q, 2** 31 - 1)
        else:
            return max( -q, -2**31)
    
    def helper(self, dend, visor):
        if dend < visor:
            return 0
        multi = 1
        subtract = visor
        while subtract + subtract < dend:
            multi = multi + multi
            subtract = subtract + subtract
        return multi + self.helper(dend - subtract, visor)


# Time: O(log(n))
# Space: O(1)
# Difficulty: medium
