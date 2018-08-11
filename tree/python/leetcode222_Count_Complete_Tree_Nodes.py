# Given a complete binary tree, count the number of nodes.

# Note:

# Definition of a complete binary tree from Wikipedia:
# In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

# Example:

# Input: 
#     1
#    / \
#   2   3
#  / \  /
# 4  5 6

# Output: 6

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        level = 1
        node = root.left
        while node:
            node = node.left
            level += 1
        path = self.find(root, [])
        bottom = 0
        for i, j in enumerate(path):
            if j == 1:
                bottom += 2 ** (level - i - 2)
        bottom += 1
        return bottom + 2 ** (level - 1) - 1
    
    def find(self, node, path):
        if not node.left and not node.right:
            return path
        left = node.left
        right = node.right
        l = r = 0
        while left:
            l += 1
            left = left.left
        while right:
            r += 1
            right = right.left
        if l == r:
            return self.find(node.right, path+[1])
        else:
            return self.find(node.left, path+[0])

# Time: O(m+n)
# Space: O(n)
# Difficulty: medium








