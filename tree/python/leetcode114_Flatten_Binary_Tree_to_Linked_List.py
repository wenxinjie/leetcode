# Given a binary tree, flatten it to a linked list in-place.

# For example, given the following tree:

#     1
#    / \
#   2   5
#  / \   \
# 3   4   6
# The flattened tree should look like:

# 1
#  \
#   2
#    \
#     3
#      \
#       4
#        \
#         5
#          \
#           6

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flatten(self, root):
        """
        :type root: TreeNode
        :rtype: void Do not return anything, modify root in-place instead.
        """
        def tranverse(node):
            res = []
            stack = [(1, node)]
            while stack:
                p = stack.pop()
                if not p[1]: continue
                stack.extend([(1, p[1].right), (1, p[1].left), (0, p[1])]) if p[0] == 1 else res.append(p[1].val)
            return res
        
        ans = tranverse(root)
        root1 = root
        for num in ans[1:]:
            root1.right = TreeNode(num)
            root.left = None
            root1 = root1.right
            

# Time: O(n)
# Space: O(n)
# Difficulty: medium