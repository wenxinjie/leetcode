# Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

# (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]).

# You are given a target value to search. If found in the array return true, otherwise return false.

# Example 1:

# Input: nums = [2,5,6,0,0,1,2], target = 0
# Output: true
# Example 2:

# Input: nums = [2,5,6,0,0,1,2], target = 3
# Output: false

class Solution:
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if not nums: return False
        l, r = 0, len(nums) - 1
        while l < r :
            mid = (l + r) // 2
            if nums[mid] == target:
                return True
        # eleminate the repeat element   
            while l < mid and nums[l] == nums[mid] :
                l += 1
            while r > mid and nums[r] == nums[mid]:
                r -= 1
                
            if nums[mid] >= nums[l] :
                if nums[mid] > target >= nums[l]:
                    r = mid
                else:
                    l = mid + 1
            else:
                if nums[mid] < target <= nums[r]:
                    l = mid + 1
                else:
                    r = mid
        return nums[l] == target
        

# Time:O(log(n))
# Space: O(1)
# Difficulty: medium