
# Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

# An example is the root-to-leaf path 1->2->3 which represents the number 123.

# Find the total sum of all root-to-leaf numbers.

# Note: A leaf is a node with no children.

# Example:

# Input: [1,2,3]
#     1
#    / \
#   2   3
# Output: 25
# Explanation:
# The root-to-leaf path 1->2 represents the number 12.
# The root-to-leaf path 1->3 represents the number 13.
# Therefore, sum = 12 + 13 = 25.


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """

        # dfs
        if not root: return 0
        def dfs(node, path, res):
            if not node.left and not node.right:
                res.append(path)
                return
            if node.left:
                dfs(node.left, path * 10 + node.left.val, res)
            if node.right:
                dfs(node.right, path * 10 + node.right.val, res)
        res = []
        dfs(root, root.val, res)
        return sum(res)



    def sumNumbers2(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """

        # bfs
        if not root: return 0
        res = 0
        from collections import deque
        stack = deque([(root, root.val)])
        while stack:
            node , cur = stack.popleft()
            if not node.left and not node.right:
                res += cur
                continue
            if node.left: stack.append((node.left, cur * 10 + node.left.val))
            if node.right: stack.append((node.right, cur * 10 + node.right.val))
        return res

# Time:O(n+m)
# Space: O(1)
# Difficulty: medium
        