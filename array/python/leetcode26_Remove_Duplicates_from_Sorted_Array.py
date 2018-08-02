# Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

# Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

# Example 1:

# Given nums = [1,1,2],

# Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

# It doesn't matter what you leave beyond the returned length.


"""
:type nums: List[int]
:rtype: int
"""
class Solution:
    def removeDuplicates1(self, nums):
        # solution 1 : inplace
        if not nums or len(nums) == 0: return 0
        i = 1
        while i < len(nums):
            if nums[i] == nums[i-1]:
                nums.pop(i)
            else:
                i += 1
        return i

# Time: O(n)
# Space: O(1)
# Difficulty: easy
	
	def removeDuplicates(self, nums):
		# solution 2 : O(n) space 
		n = len(nums)
        return n - len([nums.pop(i) for i in range(len(nums)-1,0,-1) if nums[i] == nums[i-1]])
        
# Time: O(n)
# Space: O(n)
# Difficulty: easy


