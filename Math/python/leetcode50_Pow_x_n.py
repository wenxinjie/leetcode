# Implement pow(x, n), which calculates x raised to the power n (xn).

# Example 1:

# Input: 2.00000, 10
# Output: 1024.00000
# Example 2:

# Input: 2.10000, 3
# Output: 9.26100
# Example 3:

# Input: 2.00000, -2
# Output: 0.25000
# Explanation: 2-2 = 1/22 = 1/4 = 0.25

class Solution:
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        if n == 0:
            return 1
        if x == 1:
            return 1
        if n <= 0:
            x = 1/x
            n = abs(n)
        res = self.helper(x, n)
        return res
    
    def helper(self, x, n):
        if n == 0:
            return 1
        if n == 1:
            return x
        if n % 2 == 1:
            return self.helper(x, (n-1)/2) ** 2 * x
        if n % 2 == 0:
            return self.helper(x, n / 2) ** 2


# Time: O(log(n))
# Space: O(1)
# Difficulty: medium