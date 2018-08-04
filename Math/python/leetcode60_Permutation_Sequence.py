# The set [1,2,3,...,n] contains a total of n! unique permutations.

# By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

# "123"
# "132"
# "213"
# "231"
# "312"
# "321"
# Given n and k, return the kth permutation sequence.

class Solution:
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        import math
        if k <= 0: return None
        k -= 1
        values = [str(i) for i in range(1, n + 1)]
        res = ""
        while values:
            r = math.factorial(n-1)
            i, k = k // r, k % r
            res += values[i]
            del values[i]
            n -= 1
        return res

# Time: O(n)
# Space: O(1)
# Difficulty: medium