# Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.

# Example:

# Input: 3
# Output:
# [
#   [1,null,3,2],
#   [3,2,null,1],
#   [3,1,null,null,2],
#   [2,1,3],
#   [1,null,2,null,3]
# ]
# Explanation:
# The above output corresponds to the 5 unique BST's shown below:

#    1         3     3      2      1
#     \       /     /      / \      \
#      3     2     1      1   3      2
#     /     /       \                 \
#    2     1         2                 3

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """
        if n < 1: return []
        return self.generate(1, n)
    
    def generate(self,  start, end):
        res = []
        if start > end:
            res.append(None)
        for i in range(start, end + 1):
            leftnode = self.generate(start, i-1)
            rightnode = self.generate(i+1, end)
            for l in leftnode:
                for r in rightnode:
                    node = TreeNode(i)
                    node.left = l
                    node.right = r
                    res.append(node) 
        return res


# Time: O(n^2)
# Space: O(n^3)
# Difficulty: medium