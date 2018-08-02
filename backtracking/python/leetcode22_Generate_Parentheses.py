# Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

# For example, given n = 3, a solution set is:

# [
#   "((()))",
#   "(()())",
#   "(())()",
#   "()(())",
#   "()()()"
# ]



class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        res = []
        self.helper(res, "", 0, 0 ,n)
        return res
    
    def helper(self, res, cur, left, right, n):
        if len(cur) == 2 * n:
            res.append(cur)
            return
        if left < n:
            self.helper(res, cur + "(", left + 1, right, n)
        if right < left:
            self.helper(res, cur + ")", left, right + 1, n)
            


# Time: O(2^n)
# Space: 
# Difficulty: medium