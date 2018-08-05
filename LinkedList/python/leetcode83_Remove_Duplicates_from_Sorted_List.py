# Given a sorted linked list, delete all duplicates such that each element appear only once.

# Example 1:

# Input: 1->1->2
# Output: 1->2
# Example 2:

# Input: 1->1->2->3->3
# Output: 1->2->3


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head: return head
        p1 = head
        while p1 and p1.next:
            while p1.next and p1.next.val == p1.val:
                p1.next = p1.next.next
            p1 = p1.next
        return head
        
# Time: O(n)
# Space: O(1)
# Difficulty: easy