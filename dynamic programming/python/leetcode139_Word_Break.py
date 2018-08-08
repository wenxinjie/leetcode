# Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

# Note:

# The same word in the dictionary may be reused multiple times in the segmentation.
# You may assume the dictionary does not contain duplicate words.
# Example 1:

# Input: s = "leetcode", wordDict = ["leet", "code"]
# Output: true
# Explanation: Return true because "leetcode" can be segmented as "leet code".
# Example 2:

# Input: s = "applepenapple", wordDict = ["apple", "pen"]
# Output: true
# Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
#              Note that you are allowed to reuse a dictionary word.
# Example 3:

# Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
# Output: false


class Solution:

	#  Solution 1 : dp
    def wordBreak(self, s, wordDict):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        n = len(s)
        dp = [False for _ in range(n+1)]
        dp[0] = True
        for i in range(n+1):
            for j in range(i):
                if dp[j] and s[j:i] in wordDict:
                    dp[i] = True
                    break
        return dp[n]

    def wordBreak2(self, s, wordDict):

        dic = {}
        for word in wordDict:
            dic.setdefault(word[0], []).append(word)
        dp = [False for _ in range(len(s))]
        self.helper(s, dic, dp, 0)
        return dp[-1]
    
    def helper(self, s, dic, dp, start):
        if start >= len(s):
            return
        if s[start] in dic:
            for w in dic[s[start]]:
                if w ==  s[start: start + len(w)] and not dp[start + len(w) - 1]:
                    dp[start + len(w) - 1] = True
                if dp[-1] :
                    return 
                self.helper(s, dic, dp, start + len(w))

# Time: O(n^2)
# Space: O(n)
# Difficulty: medium
        