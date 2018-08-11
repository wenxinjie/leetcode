# You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

# Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

# Example 1:

# Input: [2,3,2]
# Output: 3
# Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
#              because they are adjacent houses.


class Solution:
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums: return 0
        if len(nums) == 1: return nums[0]
        rob1 = nums[0]
        notrob1 = 0
        for i in range(1,len(nums)-1):
            tem = rob1
            rob1 = notrob1 + nums[i]
            notrob1 = max(tem, notrob1)
        res1 = max(rob1, notrob1)
        
        rob = nums[1]
        notrob = 0
        for i in range(2,len(nums)):
            tem = rob
            rob = notrob + nums[i]
            notrob = max(tem, notrob)
        res = max(rob, notrob)
        return max(res, res1)

# Time: O(n)
# Space: O(1)
# Difficulty: medium