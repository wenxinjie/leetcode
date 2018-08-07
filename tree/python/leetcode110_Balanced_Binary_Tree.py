
# Given a binary tree, determine if it is height-balanced.

# For this problem, a height-balanced binary tree is defined as:

# a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

# Example 1:

# Given the following tree [3,9,20,null,null,15,7]:

#     3
#    / \
#   9  20
#     /  \
#    15   7
# Return true.

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        self.res = True
        a = self.helper(root,0)
        return self.res
    
    def helper(self, root, depth):
        if not root:
            return depth
        a = self.helper(root.left, depth+1)
        b = self.helper(root.right, depth+1)
        if (abs(a-b) >1):
            self.res = False
        return max(a,b)

# Time: O(n)
# Space: O(n)
# Difficulty: easy       