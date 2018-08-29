# Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

# You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

# Example 1:

# Input: 1->2->3->4->5->NULL
# Output: 1->3->5->2->4->NULL
# Example 2:

# Input: 2->1->3->5->6->4->7->NULL
# Output: 2->3->6->7->1->5->4->NULL


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        cur1 = odd = ListNode(-1)
        cur2 = even = ListNode(-1)
        
        while head:
            cur1.next = head
            cur1 = cur1.next
            head = head.next
            if head:
                cur2.next = head
                cur2 = cur2.next
                head = head.next
        cur1.next = even.next
        cur2.next = None
        return odd.next

# Time: O(n)
# Space: O(n)
# Difficulty: medium
