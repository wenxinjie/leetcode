
# Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

# For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

#     1
#    / \
#   2   2
#  / \ / \
# 3  4 4  3
# But the following [1,2,2,null,3,null,3] is not:
#     1
#    / \
#   2   2
#    \   \
#    3    3


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        stack = [root]
        while stack:
            for i in range(len(stack)//2):
                if stack[i] and stack[~i]:
                    if stack[i].val != stack[~i].val:
                        return False
                elif stack[i] or stack[~i]:
                    return False
            newstack = []
            for node in stack:
                if node:
                    newstack += [node.left, node.right]
            stack = newstack
        return True



    def isSymmetric1(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root: return True
        return self.helper(root.left, root.right)
    
    def helper(self, p, q):
        if not p and not q:
            return True
        if not p or not q:
            return False
        return q.val == p.val and self.helper(p.left, q.right) and self.helper(p.right, q.left)

# Time: O(n)
# Space: O(n)
# Difficulty: easy