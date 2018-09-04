# Given two arrays, write a function to compute their intersection.

# Example 1:

# Input: nums1 = [1,2,2,1], nums2 = [2,2]
# Output: [2,2]
# Example 2:

# Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
# Output: [4,9]


class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        dic1 = {}
        for i in range(len(nums1)):
            dic1[nums1[i]]  = dic1.get(nums1[i], 0) + 1
        res = []
        for x in nums2:
            if x in dic1 and dic1[x] > 0:
                res.append(x)
                dic1[x] -= 1
        return res

# Time: O(n)
# Space: O(n)
# Difficulty: easy