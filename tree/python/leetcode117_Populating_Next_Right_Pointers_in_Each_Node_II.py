# Given a binary tree

# struct TreeLinkNode {
#   TreeLinkNode *left;
#   TreeLinkNode *right;
#   TreeLinkNode *next;
# }
# Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

# Initially, all next pointers are set to NULL.

# Note:

# You may only use constant extra space.
# Recursive approach is fine, implicit stack space does not count as extra space for this problem.
# Example:

# Given the following binary tree,

#      1
#    /  \
#   2    3
#  / \    \
# 4   5    7
# After calling your function, the tree should look like:

#      1 -> NULL
#    /  \
#   2 -> 3 -> NULL
#  / \    \
# 4-> 5 -> 7 -> NULL

# Definition for binary tree with next pointer.
# class TreeLinkNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree link node
    # @return nothing
    def connect(self, root):
        # from collections import deque
        if root:
            queue = [root]
            while queue:
                tem = []
                for i in range(len(queue)):
                    if queue[i].left: tem.append(queue[i].left)
                    if queue[i].right: tem.append(queue[i].right)
                for i in range(len(queue)-1):
                    queue[i].next = queue[i+1]
                queue[len(queue) - 1].next = None
                queue = tem

# Time: O(n)
# Space: O(1)
# Difficulty: medium