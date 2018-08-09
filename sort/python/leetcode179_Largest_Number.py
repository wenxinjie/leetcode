# Given a list of non negative integers, arrange them such that they form the largest number.

# Example 1:

# Input: [10,2]
# Output: "210"
# Example 2:

# Input: [3,30,34,5,9]
# Output: "9534330"

class Solution(object):
    def largestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        if not nums: return ""
        nums = [str(i) for i in nums]
        nums.sort(cmp = lambda x,y: cmp(y+x, x+y))
        return "".join(nums).lstrip("0") or "0"


# Time: O(nlog(n))
# Space: O(n)
# Difficulty: medium