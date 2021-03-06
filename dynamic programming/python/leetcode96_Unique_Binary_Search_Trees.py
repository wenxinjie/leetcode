
# Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?

# Example:

# Input: 3
# Output: 5
# Explanation:
# Given n = 3, there are a total of 5 unique BST's:

#    1         3     3      2      1
#     \       /     /      / \      \
#      3     2     1      1   3      2
#     /     /       \                 \
#    2     1         2                 3

class Solution:
    def numTrees(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = [ 0 for i in range(n+1)]
        res[0] = 1
        for i in range(1,n+1):
            for j in range(i):
                res[i] += res[j] * res[i-j-1]
        return res[n]
                
# Time: O(n^2)
# Space: O(n)
# Difficulty: medium