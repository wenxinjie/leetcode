# Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

# Example:

# Input: 2
# Output: 91 
# Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, 
#              excluding 11,22,33,44,55,66,77,88,99


class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        :type n: int
        :rtype: int
        """
        pool = [9,9,8,7,6,5,4,3,2,1]
        res = 1
        product = 1
        
        for i in range(min(n,10)):
            product *= pool[i]
            res += product
            
        return res

# Time: O(1)
# Space: O(1)
# Difficulty: medium