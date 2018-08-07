
# Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

# Note: A leaf is a node with no children.

# Example:

# Given the below binary tree and sum = 22,

#       5
#      / \
#     4   8
#    /   / \
#   11  13  4
#  /  \    / \
# 7    2  5   1
# Return:

# [
#    [5,4,11,2],
#    [5,8,4,5]
# ]

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:

	# Solution 1: dfs
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        if not root: return []
        res = []
        def dfs(node, cur_sum, path, res):
            if not node.left and not node.right and cur_sum == sum:
                res.append(path)
                return
            if node.left:
                dfs(node.left, cur_sum + node.left.val, path + [node.left.val], res)
            if node.right:
                dfs(node.right, cur_sum + node.right.val, path + [node.right.val], res)
        dfs(root, root.val, [root.val],res)
        return res



    # Solution 2: bfs
    def pathSum2(self, root, sum):
    	if not root: return []
        from collections import deque
        queue = deque([(root, root.val, [root.val])])
        res = []
        while queue:
            node, cur_sum, path = queue.popleft()
            if not node.left and not node.right and cur_sum == sum:
                res.append(path)
                continue
            if node.left:
                queue.append((node.left, cur_sum+node.left.val, path+[node.left.val]))
            if node.right:
                queue.append((node.right, cur_sum+node.right.val, path+[node.right.val]))
        return res
            


# Time: O(m + n)
# Space: O(m + n)
# Difficulty: medium

	











