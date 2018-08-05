# Implement int sqrt(int x).

# Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

# Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

# Example 1:

# Input: 4
# Output: 2
# Example 2:

# Input: 8
# Output: 2
# Explanation: The square root of 8 is 2.82842..., and since 
#              the decimal part is truncated, 2 is returned.

class Solution:
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        elif x < 4:
            return 1
        elif x < 9:
            return 2
        res = self.helper(x, 0, x//2)
        return res
    
    def helper(self, x, left, right):
        mid = (left + right)//2
        if mid**2 <= x and (mid+1)**2:
            return mid
        elif mid**2 > x:
            right = mid            
        elif mid**2 < x:
            left = mid
        return self.helper(x, left, right)

# Time: O(log(n))
# Space: O(1)
# Difficulty: easy