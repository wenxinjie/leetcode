# Sort a linked list using insertion sort.

# Algorithm of Insertion Sort:

# Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
# At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
# It repeats until no input elements remain.

# Example 1:

# Input: 4->2->1->3
# Output: 1->2->3->4


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def insertionSortList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        dummy = ListNode(0)
        dummy.next = head
        pre, cur, tem = None, head, None
        while cur and cur.next:
            if cur.val <= cur.next.val:
                cur = cur.next
            else:
                tem = cur.next
                cur.next = tem.next
                pre = dummy
                while pre.next and pre.next.val <= tem.val:
                    pre = pre.next
                tem.next = pre.next
                pre.next = tem 
                
        return  dummy.next

# Time: O(n^2)
# Space: O(1)
# Difficulty: medium        
