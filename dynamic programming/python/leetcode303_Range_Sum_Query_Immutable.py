# Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

# Example:
# Given nums = [-2, 0, 3, -5, 2, -1]

# sumRange(0, 2) -> 1
# sumRange(2, 5) -> -1
# sumRange(0, 5) -> -3

class NumArray:

    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        self.array = [0]
        for num in nums:
            self.array.append(self.array[-1] + num)
            
    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        return self.array[j+1] - self.array[i]


# Time: O(n)
# Space: O(n)
# Difficulty: easy