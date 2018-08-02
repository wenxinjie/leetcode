# Given a linked list, swap every two adjacent nodes and return its head.

# Example:

# Given 1->2->3->4, you should return the list as 2->1->4->3.



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = heads = ListNode(0)
        heads.next = head
        while heads.next and heads.next.next:
            heads.next,heads.next.next,c = heads.next.next, heads.next, heads.next.next.next
            heads.next.next.next = c
            heads = heads.next.next
        return dummy.next

# Time: O(n)
# Space: O(1)
# Difficulty: medium