
# Given a string s, partition s such that every substring of the partition is a palindrome.

# Return all possible palindrome partitioning of s.

# Example:

# Input: "aab"
# Output:
# [
#   ["aa","b"],
#   ["a","a","b"]
# ]


class Solution(object):
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
        res = []
        self.helper(res, [], s)
        return res
    
    def helper(self, res, cur, s):
        if (len(s) == 0):
            res.append(cur+[])
            return
        for i in range(len(s)):
            tem = s[:i+1]
            if tem == tem[::-1]:
                cur.append(tem)
                self.helper(res, cur, s[i+1:])
                cur.pop()

# Time: O(n!)
# Space: O(n * n!)
# Difficulty:  medium               