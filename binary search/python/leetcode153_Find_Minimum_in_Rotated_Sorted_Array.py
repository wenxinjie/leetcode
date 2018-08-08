# Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

# (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

# Find the minimum element.

# You may assume no duplicate exists in the array.

# Example 1:

# Input: [3,4,5,1,2] 
# Output: 1
# Example 2:

# Input: [4,5,6,7,0,1,2]
# Output: 0

class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums or len(nums) == 0: return None
        else:
            left, right = 0, len(nums)-1
            if nums[left] < nums[right]: return nums[left]
            else:
                while left < right - 1:
                    mid = (left + right) / 2
                    if nums[mid] > nums[left] :
                        left = mid
                    else:
                        right = mid
                return nums[left] if nums[left] < nums[right] else nums[right]

# Time: O(log(n))
# Space: O(1)
# Difficulty: medium