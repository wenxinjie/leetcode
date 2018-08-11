# Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

# Note: The algorithm should run in linear time and in O(1) space.

# Example 1:

# Input: [3,2,3]
# Output: [3]
# Example 2:

# Input: [1,1,1,3,3,2,2,2]
# Output: [1,2]

class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if not nums: return []
        n1, n2, cnt1, cnt2 = 0,1,0,0
        for num in nums:
            if num == n1:
                cnt1 += 1
            elif num == n2:
                cnt2 += 1
            elif cnt1 == 0:
                n1 = num
                cnt1 = 1
            elif cnt2 == 0:
                n2 = num
                cnt2 = 1
            else:
                cnt1, cnt2 = cnt1-1, cnt2-1
        return [num for num in (n1, n2) if nums.count(num) > len(nums)//3]

# Time: O(n)
# Space: O(1)
# Difficulty: medium
