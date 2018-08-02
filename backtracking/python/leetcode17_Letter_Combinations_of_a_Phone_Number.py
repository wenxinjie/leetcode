# Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

# A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
# Example:

# Input: "23"
# Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

"""
:type digits: str
:rtype: List[str]
"""

class Solution(object):
    def letterCombinations1(self, digits):
# method 1 : using itertools.product to do elementwise product between all the element
        if len(digits) == 0:
            return []
        
        dic = {"2": "abc", "3":"def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}
        res = []
        for i in digits:
            res.append(dic[i])
        return ["".join(i) for i in itertools.product(*res)]


	def letterCombinations2(self, digits):
# method 2 : backtracking
        if not digits:
            return []
        self.map = ["", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" ]
        res = []
        self.helper(res, "", 0, digits)
        return res
    
    def helper(self, res, prefix, offset, digits):
        if offset == len(digits):
            res.append(prefix)
            return 
        strs = self.map[ord(digits[offset]) - ord("0")]
        for i in range(len(strs)):
            self.helper(res, prefix + strs[i], offset + 1, digits)

# Time: O(n^2)
# Space: O(3^n)
# Difficulty: medium