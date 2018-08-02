//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
//Example:
//
//Input: 1->2->4, 1->3->4
//Output: 1->1->2->3->4->4

package wenxinjie;

public class leetcode21_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//    	solution 1: iterative
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                head.next = l2;
                l2 = l2.next;
            }
            else{
                head.next = l1;
                l1 = l1.next;
            }
            head = head.next;
        }
        if (l1 != null) head.next = l1;
        if (l2 != null) head.next = l2;
        return dummy.next;
    }

//Time: O(n)
//Space: O(n)
//Difficulty: easy 

//    solution 2: recursive
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null){
        if (l1 == null) return l2;
        else return l1;
    }
    if (l1.val > l2.val){
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
    else{
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }
    }
//Time: O(n)
//Space: O(1)
//Difficulty: easy    
}
