# Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

# This is case sensitive, for example "Aa" is not considered a palindrome here.

# Note:
# Assume the length of given string will not exceed 1,010.

# Example:

# Input:
# "abccccdd"

# Output:
# 7

# Explanation:
# One longest palindrome that can be built is "dccaccd", whose length is 7.


class Solution:
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        dic = collections.defaultdict(int)
        
        for c in s:
            dic[c] += 1
        
        res = 0
        odd = False
        for value in dic.values():
            if value % 2 == 1:
                res += value - 1
                odd = True
            else:
                res += value
        
        return res + odd
 
# Time: O(n) 
# Space: O(n)
# Difficulty: easy

