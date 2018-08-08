# A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

# Return a deep copy of the list.


# Definition for singly-linked list with a random pointer.
# class RandomListNode(object):
#     def __init__(self, x):
#         self.label = x
#         self.next = None
#         self.random = None

class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: RandomListNode
        :rtype: RandomListNode
        """
        if not head:  return None
        clonehead = RandomListNode(head.label)
        clonecur = clonehead
        cur = head
        dic = {head:clonehead}
        while cur:
            if cur.next:
                if cur.next in dic:
                    clonecur.next = dic[cur.next]
                else:
                    clonecur.next = RandomListNode(cur.next.label)
                    dic[cur.next] = clonecur.next
            
            if cur.random:
                if cur.random in dic:
                    clonecur.random = dic[cur.random]
                else:
                    clonecur.random = RandomListNode(cur.random.label)
                    dic[cur.random] = clonecur.random
            cur = cur.next
            clonecur = clonecur.next
        return clonehead


    def copyRandomList2(self, head):
    	if not head: return head
        h = head
        while h:
            n = RandomListNode(h.label)
            n.next = h.next
            h.next = n
            h = n.next
        h = head
        while h:
            if h.random:
                h.next.random = h.random.next
            h = h.next.next
        nh = dummy = RandomListNode(0)
        h = head
        while h:
            nh.next = h.next
            nh = nh.next            
            t = h.next.next
            h.next = t
            h = h.next

        return dummy.next

# Time: O(n)
# Space: O(n)
# Difficulty: medium