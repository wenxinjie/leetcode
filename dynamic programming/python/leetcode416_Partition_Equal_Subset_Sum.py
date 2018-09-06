# Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

# Note:
# Each of the array element will not exceed 100.
# The array size will not exceed 200.
# Example 1:

# Input: [1, 5, 11, 5]

# Output: true

# Explanation: The array can be partitioned as [1, 5, 5] and [11].


class Solution(object):
    def canPartition(self, nums):
        if not nums:
            return False
        
        a = sum(nums)
        if a % 2 != 0:
            return False
        
        target = a / 2 
        
        dp = [True] + [False for _ in range(target)]
        for num in sorted(nums):
            for i in range(target, -1,-1):
                if i < num:
                    break
                dp[i] = dp[i] or dp[i - num]
        return dp[target]


# Time: O(n * k)
# Space: O(n)
# Difficulty: medium       