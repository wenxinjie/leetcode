# Sort a linked list in O(n log n) time using constant space complexity.

# Example 1:

# Input: 4->2->1->3
# Output: 1->2->3->4
# Example 2:

# Input: -1->5->3->4->0
# Output: -1->0->3->4->5

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def sortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head is None or head.next is None:
            return head
        mid = self.getmid(head)
        head2 = mid.next
        mid.next = None
        
        return self.merge(self.sortList(head), self.sortList(head2))
    
    def getmid(self, head):
        fast = head
        slow = head
        while fast and fast.next and fast.next.next:
            fast = fast.next.next
            slow = slow.next
        return slow
    
    def merge(self, l, r):
        if l.val >= r.val: 
            l, r = r, l
        p = l
        while l and r and l.next:
            if  l.val <= r.val <= l.next.val:
                tem = r.next
                r.next = l.next
                l.next = r
                r = tem
                l = l.next
            elif r.val > l.next.val:
                l = l.next
        if l.next == None:
            l.next = r        
        return p

# Time: O(nlog(n))
# Space: O(1) 
# Difficulty: medium