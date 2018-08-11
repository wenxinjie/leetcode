# Given a singly linked list, determine if it is a palindrome.

# Example 1:

# Input: 1->2
# Output: false
# Example 2:

# Input: 1->2->2->1
# Output: true

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if not head or not head.next:  return True
        fast = slow = head
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
                       
        if fast : slow = slow.next       
        newhead = None
        while slow:
            tem = slow.next
            slow.next = newhead
            newhead = slow
            slow = tem       
        while (head and newhead):
            if head.val != newhead.val:
                return False
            head = head.next
            newhead = newhead.next
        return True

# Time: O(n)
# Space: O(n)
# Difficulty: medium