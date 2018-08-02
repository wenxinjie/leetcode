# Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

# An input string is valid if:

# Open brackets must be closed by the same type of brackets.
# Open brackets must be closed in the correct order.
# Note that an empty string is also considered valid.

# Example 1:

# Input: "()"
# Output: true
# Example 2:

# Input: "()[]{}"
# Output: true


class Solution:
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if not s or len(s) == 0: return True
        n = len(s)
        if n % 2 : return False 
        res = []
        for c in s:
            if c == "(":
                res.append(")")
            elif c == "[":
                res.append("]")
            elif c == "{":
                res.append("}")
            elif res == [] or c != res.pop():
                return False
        return res == []

# Time: O(n)
# Space: O(1)
# Difficulty: easy