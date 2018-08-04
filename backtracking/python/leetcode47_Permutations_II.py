# Given a collection of numbers that might contain duplicates, return all possible unique permutations.

# Example:

# Input: [1,1,2]
# Output:
# [
#   [1,1,2],
#   [1,2,1],
#   [2,1,1]
# ]

class Solution:
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        used = [False for _ in range(len(nums))]
        self.helper1(res,[],nums, used)
        return res

    def helper1(self, res, cur, nums, used):
        if len(cur) == len(nums):
            res.append(cur+[])
            return 
        for i in range(len(nums)):
            if used[i] or( i > 0 and nums[i] == nums[i-1] and not used[i-1]):
                continue
            cur.append(nums[i])
            used[i] = True
            self.helper(res, cur, nums, used)
            cur.pop()
            used[i] = False


    def permuteUnique2(self, nums):
    	res = []
        nums.sort()
        self.helper2(res,[],nums)
        return res

    def helper2(self,res,cur,nums):
        if len(nums) == 0:
            res.append(cur+[])
            return
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            self.helper(res, cur + [nums[i]], nums[0:i] + nums[i+1:])

# Time: O(n!)
# Space: O(n!*n)
# Difficulty: medium