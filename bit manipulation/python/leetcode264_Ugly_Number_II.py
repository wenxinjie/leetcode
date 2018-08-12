# Write a program to find the n-th ugly number.

# Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

# Example:

# Input: n = 10
# Output: 12
# Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.


class Solution:
    def nthUglyNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = [1]
        p1, p2, p3 = 0, 0, 0
        for i in range(n-1):
            n1, n2, n3 = res[p1] * 2, res[p2] *3 , res[p3] * 5
            min_val = min(n1, n2, n3)
            if min_val == n1:
                p1 += 1
            if min_val == n2:
                p2 += 1
            if min_val == n3:
                p3 += 1
            res.append(min_val)
        return res[-1]

# Time: O(n)
# Space: O(n)
# Difficulty: medium