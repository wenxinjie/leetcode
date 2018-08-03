# Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

# Each number in candidates may only be used once in the combination.

# Note:

# All numbers (including target) will be positive integers.
# The solution set must not contain duplicate combinations.
# Example 1:

# Input: candidates = [10,1,2,7,6,1,5], target = 8,
# A solution set is:
# [
#   [1, 7],
#   [1, 2, 5],
#   [2, 6],
#   [1, 1, 6]
# ]



class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        candidates.sort()
        self.helper(res,[],candidates,target,0)
        return res
    
    def helper(self,res,cur,candidates,target,index):
        if target<0: return
        if target == 0:
            res.append(cur+[])
        for i in range(index,len(candidates)):
            if i!=index and candidates[i]==candidates[i-1]:continue
            else:
                cur.append(candidates[i])
                self.helper(res,cur,candidates,target-candidates[i],i+1)
                cur.pop()

# Time: kO(k^n)
# Space: O(n)
# Difficulty: medium