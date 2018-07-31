# Given a string, find the length of the longest substring without repeating characters.

# Examples:

# Given "abcabcbb", the answer is "abc", which the length is 3.

# Given "bbbbb", the answer is "b", with the length of 1.

# Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s or len(s) == 1: return len(s)
        self.max = 0
        n, i = len(s)-1, 0
        dic, start = {}, 0
        while i <= n:
            if s[i] in dic:
                start = max(start, dic[s[i]] + 1)
            dic[s[i]] = i
            self.max = max(self.max, i - start + 1)
            i += 1
        return self.max

# time: O(n)
# space: O(n)
# difficulty: medium