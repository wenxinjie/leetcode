# Given a binary tree, return the inorder traversal of its nodes' values.

# Example:

# Input: [1,null,2,3]
#    1
#     \
#      2
#     /
#    3

# Output: [1,3,2]

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:

	# Solution 1: dfs
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None: return []
        res = []
        self.helper(res,root)
        return res
    
    def helper(self,res,root):
        if root is None: return
        self.helper(res,root.left)
        res.append(root.val)
        self.helper(res,root.right)


    # Solution 2: bfs
	def inorderTraversal2(self, root):
        stack = []
        cur = root
        res = []
        while stack or cur:
            while cur:
                stack.append(cur)
                cur = cur.left
            cur = stack.pop()
            res.append(cur.val)
            cur = cur.right
        return res


# Time: O(n)
# Space: O(1)
# Difficulty: medium
            