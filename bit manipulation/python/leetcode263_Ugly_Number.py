# Write a program to check whether a given number is an ugly number.

# Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

# Example 1:

# Input: 6
# Output: true
# Explanation: 6 = 2 × 3
# Example 2:

# Input: 8
# Output: true
# Explanation: 8 = 2 × 2 × 2

class Solution:
    def isUgly(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 0: return False
        while num % 2 == 0:
            num /= 2
        while num % 3 == 0:
            num /= 3 
        while num % 5 == 0:
            num /= 5
        return num == 1

# Time: O(log(n))
# Space: O(1)
# Difficulty: easy