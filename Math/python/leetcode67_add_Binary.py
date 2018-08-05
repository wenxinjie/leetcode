# Given two binary strings, return their sum (also a binary string).

# The input strings are both non-empty and contains only characters 1 or 0.

# Example 1:

# Input: a = "11", b = "1"
# Output: "100"
# Example 2:

# Input: a = "1010", b = "1011"
# Output: "10101"


class Solution:
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        m, n = len(a) - 1, len(b) - 1
        carry = 0
        res = []
        while m >= 0 or n >= 0 or carry:
            if m >= 0 :
                carry += int(a[m])
                m -= 1
            if n >= 0:
                carry += int(b[n])
                n -= 1
            res.append(str(carry % 2))
            carry = carry // 2
        ans = ("").join(res[::-1])
        return ans
            
# Time: O(n)
# Space: O(n)
# Difficulty: easy