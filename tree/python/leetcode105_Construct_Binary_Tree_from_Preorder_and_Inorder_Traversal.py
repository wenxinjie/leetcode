# Given preorder and inorder traversal of a tree, construct the binary tree.

# Note:
# You may assume that duplicates do not exist in the tree.

# For example, given

# preorder = [3,9,20,15,7]
# inorder = [9,3,15,20,7]
# Return the following binary tree:

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
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        if not preorder or not inorder or len(preorder) == 0 or len(inorder) == 0: return None
        else:
            index = inorder.index(preorder[0])
            root = TreeNode(preorder[0])
            root.left = self.buildTree(preorder[1:index+1], inorder[:index])
            root.right = self.buildTree(preorder[index+1:], inorder[index+1:])
            return root

# Time: O(n)
# Space: O(n)
# Difficulty: medium