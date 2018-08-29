# Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

# Example 1:

# Input: 2
# Output: [0,1,1]
# Example 2:

# Input: 5
# Output: [0,1,1,2,1,2]

class Solution:
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        if num == 0: 
            return [0]
        nums = [0]
        
        while len(nums) <= num:         
            tem =  [ x + 1 for x in nums]
            nums += tem
        return nums[:num+1]
    
    def countBits2(self, num):
    	res = [0 for i in range(num + 1)]
        index = 1
        for i in range(1, num + 1):
            if i == index:
                res[i] = 1
                index *= 2
            else:
                res[i] = res[i % (index/2)] + 1
        return res

# Time: O(n)
# Space: O(n)
# Difficulty: medium
