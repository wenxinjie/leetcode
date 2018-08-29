# The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

# Determine the maximum amount of money the thief can rob tonight without alerting the police.

# Example 1:

# Input: [3,2,3,null,3,null,1]

#      3
#     / \
#    2   3
#     \   \ 
#      3   1

# Output: 7 
# Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.


# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rob(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        dic_rob = {None : 0}
        dic_not = {None : 0}
        stack = [(root, 0)]
        
        while stack:
            node, seen = stack.pop()
            if not node:
                dic_rob[node] = 0
                dic_not[node] = 0
                continue
            if not seen:
                stack.extend([(node, 1), (node.right, 0), (node.left, 0)])
            else:
                dic_rob[node] = dic_not[node.left] + dic_not[node.right] + node.val
                dic_not[node] = max(dic_not[node.left], dic_rob[node.left]) + max(dic_not[node.right], dic_rob[node.right])
                
        return max(dic_rob[root], dic_not[root])

# Time: O(n)
# Space: O(n)
# Difficulty: medium
