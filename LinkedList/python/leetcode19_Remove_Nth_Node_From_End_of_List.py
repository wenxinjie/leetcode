# Given a linked list, remove the n-th node from the end of list and return its head.

# Example:

# Given linked list: 1->2->3->4->5, and n = 2.

# After removing the second node from the end, the linked list becomes 1->2->3->5.


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        fast, slow = dummy, dummy
        
        for i in range(n + 1):
            fast = fast.next
        
        while fast:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        
        return dummy.next

# Time: O(n)
# Space: O(1)
# Difficulty: medium