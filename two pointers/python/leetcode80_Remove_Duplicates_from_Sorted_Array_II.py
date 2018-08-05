# Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

# Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

# Example 1:

# Given nums = [1,1,1,2,2,3],

# Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

# It doesn't matter what you leave beyond the returned length.
# Example 2:

# Given nums = [0,0,1,1,1,1,2,3,3],

# Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

# It doesn't matter what values are set beyond the returned length.


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # forward traverse
        cnt, i, n = 1, 1, len(nums)
        while i < len(nums):
            if nums[i] == nums[i - 1]:
                if cnt == 2:
                    del nums[i]
                else:
                    cnt += 1
                    i += 1
                    
            else:
                cnt = 1
                i += 1

    def removeDuplicates2(self, nums):
        # backward traverse
        i , cnt= len(nums) - 1, 1
        while i > 0:
            if nums[i] == nums[i-1]:
                if cnt == 2:
                    nums.remove(nums[i])
                else:
                    cnt += 1
            else:
                cnt = 1
            i -= 1
                
# Time: O(n)
# Space: O(1)
# Difficulty: medium