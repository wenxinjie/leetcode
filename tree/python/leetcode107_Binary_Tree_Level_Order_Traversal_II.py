# Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

# For example:
# Given binary tree [3,9,20,null,null,15,7],
#     3
#    / \
#   9  20
#     /  \
#    15   7
# return its bottom-up level order traversal as:
# [
#   [15,7],
#   [9,20],
#   [3]
# ]

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if not root: return []
        res, queue = [],[root]
        
        while queue:
            tem,temp = [],[]
            for node in queue:
                tem.append(node.val)
                if node.left: temp.append(node.left)
                if node.right: temp.append(node.right)
            res.append(tem)
            queue = temp
        return res[::-1]

# Time: O(n)
# Space: O(n)
# Difficulty: easy              