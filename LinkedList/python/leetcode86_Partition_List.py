# Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

# You should preserve the original relative order of the nodes in each of the two partitions.

# Example:

# Input: head = 1->4->3->2->5->2, x = 3
# Output: 1->2->2->4->3->5

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        if not head:
            return None
        dummy1 = l1 = ListNode(0)
        dummy2 = l2 = ListNode(0)
        while head:
            if head.val<x:
                l1.next = ListNode(head.val)
                l1 = l1.next
            else:
                l2.next = ListNode(head.val)
                l2 = l2.next
            head = head.next
        l1.next = dummy2.next
        return dummy1.next

# Time: O(n)
# Space: O(n)
# Difficulty: medium