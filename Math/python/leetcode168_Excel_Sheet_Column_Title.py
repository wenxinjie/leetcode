# Given a positive integer, return its corresponding column title as appear in an Excel sheet.

# For example:

#     1 -> A
#     2 -> B
#     3 -> C
#     ...
#     26 -> Z
#     27 -> AA
#     28 -> AB 
#     ...
# Example 1:

# Input: 1
# Output: "A"
# Example 2:

# Input: 28
# Output: "AB"

class Solution:
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        res = ""
        while n > 0 :
            n -= 1
            # res = "{}{}".format(chr(n % 26 + ord("A")), res)
            res = chr(n % 26 + ord("A")) + res
            n //= 26
        return res
        
# Time: O(log(n))
# Space: O(1)
# Difficulty: easy