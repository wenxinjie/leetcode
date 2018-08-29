# Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....

# Example 1:

# Input: nums = [1, 5, 1, 1, 6, 4]
# Output: One possible answer is [1, 4, 1, 5, 1, 6].
# Example 2:

# Input: nums = [1, 3, 2, 2, 3, 1]
# Output: One possible answer is [2, 3, 1, 3, 1, 2].


class Solution:
    def wiggleSort(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        nums.sort()
        mid = len(nums[::2])
        nums[::2], nums[1::2] = nums[:mid][::-1], nums[mid:][::-1]

    def wiggleSort(self, nums):
        # O(1) space
        def newind(i, n):
            if n % 2 == 0:
                n += 1
            return (1 + i * 2) % n
        
        
        nums.sort()
        mid = nums[len(nums) // 2]
        
        n = len(nums)
        
        left, right, i = 0, n-1, 0
        while i <= right:
            if nums[newind(i,n)] > mid:
                nums[newind(left,n)], nums[newind(i,n)] = nums[newind(i,n)], nums[newind(left,n)]
                left += 1
                i += 1
            elif nums[newind(i,n)] < mid:
                nums[newind(right,n)], nums[newind(i,n)] = nums[newind(i,n)], nums[newind(right,n)]
                right -= 1
                
            else :
                i += 1

# Time: O(n)
# Space: O(1)
# Difficulty: medium
