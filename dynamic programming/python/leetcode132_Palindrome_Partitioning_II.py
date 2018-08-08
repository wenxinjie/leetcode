# Given a string s, partition s such that every substring of the partition is a palindrome.

# Return the minimum cuts needed for a palindrome partitioning of s.

# Example:

# Input: "aab"
# Output: 1
# Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.


class Solution(object):
    def minCut(self, s):
        """
        :type s: str
        :rtype: int
        """
        n = len(s)
        dp = [0 for _ in range(n)]
        pal = [[False for i in range(n)] for j in range(n)]
        for i in range(n):
            cut = i
            for j in range(i+1):
                if s[i] == s[j] and (j + 1 > i - 1 or pal[j+1][i-1]) :
                    pal[j][i] = True
                    cut = 0 if j == 0 else min(dp[j] + 1, cut)
            dp[i] = cut
        return dp[-1]

# Time: O(n^2)
# Space: O(n^2)
# Difficulty: medium