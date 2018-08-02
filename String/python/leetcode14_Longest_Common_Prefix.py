# Write a function to find the longest common prefix string amongst an array of strings.

# If there is no common prefix, return an empty string "".

# Example 1:

# Input: ["flower","flow","flight"]
# Output: "fl"
# Example 2:

# Input: ["dog","racecar","car"]
# Output: ""
# Explanation: There is no common prefix among the input strings.

class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        strs.sort()
        a, b = strs[0], strs[-1]
        for i in range(len(a)):
            if b[i]!=a[i]:
                return a[:i]
        return a
                
# Time: O(1)
# Space: O(1)
# Difficulty: easy

# you only need to compare the first one and  the last one after sorting, since there are most difference between those two.