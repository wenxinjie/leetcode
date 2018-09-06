# Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

# Example:

# nums = [1, 2, 3]
# target = 4

# The possible combination ways are:
# (1, 1, 1, 1)
# (1, 1, 2)
# (1, 2, 1)
# (1, 3)
# (2, 1, 1)
# (2, 2)
# (3, 1)

# Note that different sequences are counted as different combinations.

# Therefore the output is 7.

class Solution(object):
    def combinationSum4(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        dp = [1] + [0 for _ in range(target)]
        nums.sort()
        for i in range(target+1):
            for num in nums:
                if i < num:
                    break
                dp[i] += dp[i-num]
        return dp[-1]

# Time: O(n)
# Space: O(n)
# Difficulty: medium
