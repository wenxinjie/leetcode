# Write a program to find the nth super ugly number.

# Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.

# Example:

# Input: n = 12, primes = [2,7,13,19]
# Output: 32 
# Explanation: [1,2,4,7,8,13,14,16,19,26,28,32] is the sequence of the first 12 
#              super ugly numbers given primes = [2,7,13,19] of size 4.


class Solution(object):
    def nthSuperUglyNumber(self, n, primes):
        """
        :type n: int
        :type primes: List[int]
        :rtype: int
        """
        m = len(primes)
        points = [0 for i in range(m)]
        res = [1]
        values = [0 for i in range(m)]
        for i in range(n-1):
            for j in range(m):
                values[j] = res[points[j]] * primes[j]
            min_v = min(values)
            for j in range(m):
                if values[j] == min_v:
                    points[j] += 1
            res.append(min_v)
        return res[-1]

# Time: O(nlog(k))
# Space: O(k)
# Difficulty: medium           
