# Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

# Example 1:

# Input: 1->2->3->3->4->4->5
# Output: 1->2->5
# Example 2:

# Input: 1->1->1->2->3
# Output: 2->3

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
        dummy = ListNode(1234)
        p1 = dummy
        dummy.next = head
        
        while p1.next and p1.next.next:
            if p1.next.val == p1.next.next.val:
                value = p1.next.val
                while p1.next and p1.next.val == value:
                    p1.next = p1.next.next
            else:
                p1 = p1.next
        return dummy.next

# Time: O(n)
# Space: O(1)
# Difficulty: medium