# Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

# Example 1:

# Input: 11
# Output: 3
# Explanation: Integer 11 has binary representation 00000000000000000000000000001011 
# Example 2:

# Input: 128
# Output: 1
# Explanation: Integer 128 has binary representation 00000000000000000000000010000000

class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        cnt = 0
        while n>0:
            tem = n & 1
            cnt += tem
            n >>= 1
        return cnt

# Time: O(1)
# Space: O(1)
# Difficulty: easy        