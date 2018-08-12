
# Given an unsorted array of integers, find the length of longest increasing subsequence.

# Example:

# Input: [10,9,2,5,3,7,101,18]
# Output: 4 
# Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
# Note:

# There may be more than one LIS combination, it is only necessary for you to return the length.
# Your algorithm should run in O(n2) complexity.

class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:  return 0
        dp = [0 for i in range(len(nums) +1 )]
        dp[1] = 1
        res = 0
        for i in range(len(nums)):
            tem = 0
            for j in range(i):
                if nums[j] < nums[i]:
                    tem = max(tem, dp[j])
            dp[i] = tem + 1
            res = max(res, dp[i])
        return res
    
	
	def lengthOfLIS2(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0
        n = len(nums)
        sequence = [nums[0]]
        for i in range(1,n):
            val = nums[i]
            if val > sequence[-1]:
                sequence.append(val)
            else:
                index = bisect.bisect_left(sequence, val)
                sequence[index] = val
        return len(sequence)
        
# Time: O(n^2)
# Space: O(n)
# Difficulty: medium    