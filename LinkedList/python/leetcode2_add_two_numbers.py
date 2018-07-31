# You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
# You may assume the two numbers do not contain any leading zero, except the number 0 itself.
# Example:

# Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
# Output: 7 -> 0 -> 8
# Explanation: 342 + 465 = 807.




# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


"""
:type l1: ListNode
:type l2: ListNode
:rtype: ListNode
"""
class Solution(object):
    def addTwoNumbers1(self, l1, l2):
        # using "carry" as an indicator
        carry = 0
        r1, r2 = 0 ,0
        head = n =ListNode(0)
        while l1 or l2 or carry:
            if l1:
                r1 = l1.val
                l1 = l1.next
            if l2:
                r2 = l2.val
                l2 = l2.next
                
            carry, res = divmod(r1+r2+carry, 10)
            n.next = ListNode(res)
            r1, r2 = 0,0
            n = n.next
            
        return head.next
        
    def addTwoNumbers2(self, l1, l2):
        # get two numbers first and store the sum to ListNode
        def getnumber(self,node):
            res = []
            while node:
                res.append(node.val)
                node = node.next
            tem = [10**i * res[i]  for i in range(len(res))]
            return sum(tem) 

        m, n = self.getnumber(l1), self.getnumber(l2)
        res = str(m + n)
        leng = len(res)
        head = ans = ListNode(int(res[-1]))
        i = leng-2
        while i >=0 :
            ans.next = ListNode(int(res[i]))
            i -= 1
            ans = ans.next
        return head

#time: O(n)
#space: O(n)
#difficulty: medium
    
        