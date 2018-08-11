# Given two strings s and t, determine if they are isomorphic.

# Two strings are isomorphic if the characters in s can be replaced to get t.

# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Example 1:

# Input: s = "egg", t = "add"
# Output: true
# Example 2:

# Input: s = "foo", t = "bar"
# Output: false


class Solution:
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if not s or not t: return True
        if len(s) != len(t) : return False
        
        dic = {}
        dic2 = {}
        for i in range(len(s)):
            if s[i] in dic:
                if t[i] != dic.get(s[i]):
                    return False
            if t[i] in dic2:
                if s[i] != dic2.get(t[i]):
                    return False                
            dic[s[i]] = t[i]
            dic2[t[i]] = s[i]
        return True
        
# Time: O(n)
# Space: O(n)
# Difficulty: easy