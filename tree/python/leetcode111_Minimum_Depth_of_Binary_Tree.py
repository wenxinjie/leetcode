# Given a binary tree, find its minimum depth.

# The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

# Note: A leaf is a node with no children.

# Example:

# Given binary tree [3,9,20,null,null,15,7],

#     3
#    / \
#   9  20
#     /  \
#    15   7


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        count = 0
        tem, tem1 = [],[root]
        if not root: return count
        while (1):
            count += 1
            for node in tem1:
                if not node.left and not node.right:
                    return count
                if node.left: 
                    tem.append(node.left)
                if node.right:
                    tem.append(node.right)
            tem1 = tem
            tem = []

# Time:O(n)
# Space: O(n)
# Difficulty: easy            