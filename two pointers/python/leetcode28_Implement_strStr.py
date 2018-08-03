# Implement strStr().

# Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

# Example 1:

# Input: haystack = "hello", needle = "ll"
# Output: 2
# Example 2:

# Input: haystack = "aaaaa", needle = "bba"
# Output: -1


class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if not needle:
            return 0
        i = j = 0
        label = 0
        while i < len(needle) and j < len(haystack):
            if haystack[j] == needle[i]:
            	if i == 0:
            		label = j
                j += 1
                i += 1
            else:
            	if i != 0:
            		j = label 
                i = 0              
                j = j + 1
        return -1 if i < len(needle) else j - i  

# Time: O(n^2)
# Space: O(1)
# Difficulty: easy