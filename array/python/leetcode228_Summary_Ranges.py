# Given a sorted integer array without duplicates, return the summary of its ranges.

# Example 1:

# Input:  [0,1,2,4,5,7]
# Output: ["0->2","4->5","7"]
# Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
# Example 2:

# Input:  [0,2,3,4,6,8,9]
# Output: ["0","2->4","6","8->9"]
# Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.

class Solution:
    def summaryRanges(self, nums):
        if not nums: return []
        n,p1,p2 = len(nums),0,0
        res,res1 = [],[]
        nums = nums 
        while p2 < n-1:
            if nums[p2] +1 == nums[p2+1]:
                p2 = p2+1
            else:
                tem = [nums[p1],nums[p2]]
                res.append(tem + [])
                p2 = p2+1
                p1 = p2
                
        res.append([nums[p1], nums[p2]])
        
        for i in range(len(res)):
            if res[i][0] == res[i][1]:
                res1.append(str(res[i][0]))
            else:
                res1.append(str(res[i][0]) + "->" + str(res[i][1]))
        return res1

    def summaryRanges2(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        res = []
        if len(nums) == 1:
            res.append(str(nums[0]))
            return  res
        i = 0
        while i < len(nums):
            a = nums[i]
            while i < len(nums) - 1 and nums[1+i] == nums[i] +1:
                i+= 1
            if a != nums[i]:
                res.append(str(a) + "->" + str(nums[i]))
            else:
                res.append(str(a))
            i += 1
        return res

# Time: O(n)
# Space: O(n)
# Difficulty: medium