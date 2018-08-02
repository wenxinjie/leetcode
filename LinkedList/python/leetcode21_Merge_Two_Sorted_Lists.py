# Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

# Example:

# Input: 1->2->4, 1->3->4
# Output: 1->1->2->3->4->4

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def mergeTwoLists1(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # solution 1: iterative
        head = dummy = ListNode(0)
        while l1 and l2:
            if l1.val > l2.val:
                head.next = l2
                l2 = l2.next               
            else:
                head.next = l1
                l1 = l1.next
            head = head.next
        if l1: head.next = l1
        if l2: head.next = l2
        return dummy.next

# Time: O(n)
# Space: O(n)
# Difficulty: easy 

	def mergeTwoLists2(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
     	# solution 2: recursive   
        if not l1 or not l2:
            return l1 or l2
        if l1.val > l2.val:
            l2.next = self.mergeTwoLists(l1, l2.next)
            return l2
        else:
            l1.next = self.mergeTwoLists(l1.next, l2)
            return l1
# Time: O(n)
# Space: O(1)
# Difficulty: easy 
