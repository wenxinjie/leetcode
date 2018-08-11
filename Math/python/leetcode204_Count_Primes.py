# Count the number of prime numbers less than a non-negative number, n.

# Example:

# Input: 10
# Output: 4
# Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

class Solution:
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 2: return 0 
        res = [ 1 for i in range(n+1) ]
        res[0], res[1] = 0, 0
        for i in range(2,n+1):
            if res[i] == 1:
                for j in range(2, n//i + 1):
                    res[i * j] = 0
        return sum(res[:-1])

# Time: O(n)
# Space: O(n)
# Difficulty: easy