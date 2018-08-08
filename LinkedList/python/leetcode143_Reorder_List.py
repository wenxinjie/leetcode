# Given a singly linked list L: L0→L1→…→Ln-1→Ln,
# reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

# You may not modify the values in the list's nodes, only nodes itself may be changed.

# Example 1:

# Given 1->2->3->4, reorder it to 1->4->2->3.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reorderList(self, head):
        """
        :type head: ListNode
        :rtype: void Do not return anything, modify head in-place instead.
        """
        if head and head.next:
            slow = fast = head
            while fast and fast.next:
                fast = fast.next.next
                slow = slow.next
            mid = slow
            l2 = slow.next
            mid.next = None
            l2 = self.reverse(l2)
            l1 = head
            while l1 and l2:
                tem = l1.next
                l1.next = l2
                l2 = l2.next
                l1.next.next = tem
                l1 = tem
            

    def reverse(self, head):
        newhead = None
        while head:
            tem = head.next
            head.next = newhead
            newhead = head
            head = tem
        return newhead

# Time: O(n)
# Space: O(n)
# Difficulty:  medium       