# Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
# Example 1:
# Input: "babad"
# Output: "bab"
# Note: "aba" is also a valid answer.
# Example 2:
# Input: "cbbd"
# Output: "bb"

"""
:type s: str
:rtype: str
"""
class Solution:
    def longestPalindrome1(self, s):
    	# dp method
        n = len(s)
        if n < 2: return s
        res = ""
        dp = [[False for _ in range(n)] for _ in range(n)]
        for i in range(n-1, -1,-1):
            for j in range(i,n):
                dp[i][j] = (s[i] == s[j] and (j-i < 3 or dp[i+1][j-1]))
                if dp[i][j] and (j - i + 1 > len(res)):
                    res = s[i:j+1]
        return res

# space: O(n^2)
# time: O(n^2)
# difficulty: medium

	def longestPalindrome2(self, s):
		# Expand Around Source
        if len(s) < 2 : return s
        self.res = ""
        for i in range(len(s)):
            self.helper(s, i, i)
            self.helper(s, i, i+1)
        return self.res
    
    def helper(self, s, left, right):
        while left >= 0 and right <= len(s) -1 and s[left] == s[right]:
            left -= 1
            right += 1
        if right - left -1 > len(self.res):
            self.res = s[left + 1: right]
# time: O(n^2)
# space: O(1)







