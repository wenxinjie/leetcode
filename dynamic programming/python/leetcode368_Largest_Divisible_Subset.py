# Given a set of distinct positive integers, find the largest subset such that every pair (Si, Sj) of elements in this subset satisfies:

# Si % Sj = 0 or Sj % Si = 0.

# If there are multiple solutions, return any subset is fine.

# Example 1:

# Input: [1,2,3]
# Output: [1,2] (of course, [1,3] will also be ok)
# Example 2:

# Input: [1,2,4,8]
# Output: [1,2,4,8]


class Solution:
    def largestDivisibleSubset(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        dic = {-1: set()}
        
        for i in sorted(nums):
            dic[i] = max( (dic[d] for d in dic if i % d == 0), key = len)  | { i }
        
        return list(max(dic.values() , key = len))

# Time: O(nlog(n))
# Space: O(n ** 2)
# Difficulty: medium