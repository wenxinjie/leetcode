# Given a pattern and a string str, find if str follows the same pattern.

# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1:

# Input: pattern = "abba", str = "dog cat cat dog"
# Output: true
# Example 2:

# Input:pattern = "abba", str = "dog cat cat fish"
# Output: false
# Example 3:

# Input: pattern = "aaaa", str = "dog cat cat dog"
# Output: false

class Solution:
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        if not str: return False
        str = str.split(" ")
        d = {}
        if len(pattern) != len(str): return False       
        
        for i in range(len(pattern)):
            if pattern[i] in d.keys():
                if d[pattern[i]] == str[i]:
                    continue
                else:
                    return False
            else:
                if str[i] in d.values():
                    return False
                else:
                    d[pattern[i]] = str[i]  
        return True

# Time: O(n)
# Space: O(n)
# Difficulty: easy                   