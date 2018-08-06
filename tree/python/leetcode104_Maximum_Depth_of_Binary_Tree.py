
# Given a binary tree, find its maximum depth.

# The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

# Note: A leaf is a node with no children.

# Example:

# Given binary tree [3,9,20,null,null,15,7],

#     3
#    / \
#   9  20
#     /  \
#    15   7
# return its depth = 3.

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        queue= [root]
        depth = 1
        while queue:
            queue1 = []
            for node in queue:
                if node.left:
                    queue1.append(node.left)
                if node.right:
                    queue1.append(node.right)
            queue = queue1
            
            depth += 1
        return depth-1

# Time: O(n)
# Space: O(n)
# Difficulty: medium