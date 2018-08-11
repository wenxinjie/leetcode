# Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

# Example: 

# Input: s = 7, nums = [2,3,1,2,4,3]
# Output: 2
# Explanation: the subarray [4,3] has the minimal length under the problem constraint.


class Solution:
    def minSubArrayLen(self, s, nums):
        """
        :type s: int
        :type nums: List[int]
        :rtype: int
        """
        if not nums or len(nums) == 0 or sum(nums) < s: return 0
        start, end = 0, 1
        res = n = len(nums)
        cur = nums[0]
        while start < n or end <= n:
            if cur >= s:
                res = min(res, end - start)
                cur -= nums[start]
                start += 1
            elif end < n:
                cur += nums[end]
                end += 1
                
            else:
                break
        return res

    def minSubArrayLen(self, s, nums):
    	if not nums or len(nums) == 0: return 0
        else:
            n = len(nums)
            tem = [0 for i in range(n+1)]
            for i in range(1,n+1):
                tem[i] = tem[i-1] + nums[i-1]
            mini = n+1
            r, l = 0,0
            while r <= n:
                if tem[r] - tem[l] >= s:
                    mini = min(r-l,mini)
                    l += 1
                else:
                    r += 1
            if mini == n+1: return 0
            return mini

# Time: O(n)
# Space: O(1)
# Difficulty: medium