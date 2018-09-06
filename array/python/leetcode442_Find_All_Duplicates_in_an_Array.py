# Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

# Find all the elements that appear twice in this array.

# Could you do it without extra space and in O(n) runtime?

# Example:
# Input:
# [4,3,2,7,8,2,3,1]

# Output:
# [2,3]

class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        i = 0
        while i < len(nums):
            j = nums[i] - 1
            if nums[j] != nums[i]:
                nums[j], nums[i] = nums[i] , nums[j]
            else:
                i += 1
        print(nums)
        res = []
        for i in range(len(nums)):
            if i + 1 != nums[i]:
                res.append(nums[i])
        return res

# Time: O(n)
# Space: O(1)
# Difficulty: medium


print(Solution().findDuplicates([4,3,2,7,8,2,3,1]))
