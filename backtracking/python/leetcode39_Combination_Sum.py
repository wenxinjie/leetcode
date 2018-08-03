# Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

# The same repeated number may be chosen from candidates unlimited number of times.

# Note:

# All numbers (including target) will be positive integers.
# The solution set must not contain duplicate combinations.
# Example 1:

# Input: candidates = [2,3,6,7], target = 7,
# A solution set is:
# [
#   [7],
#   [2,2,3]
# ]

class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        self.helper(res,[],candidates,target,0)
        return res
    
    def helper(self,res,cur,candidates,target,index):
        if target < 0: return
        if target == 0: res.append(cur+[])
        for i in range(index,len(candidates)):
            cur.append(candidates[i])
            self.helper(res,cur,candidates,target-candidates[i],i)
            cur.pop()
        


# Time: kO(k^n)
# Space: O(n)
# Difficulty: medium