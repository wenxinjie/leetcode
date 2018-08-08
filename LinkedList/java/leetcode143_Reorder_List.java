//Given a singly linked list L: L0→L1→…→Ln-1→Ln,
//reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
//
//You may not modify the values in the list's nodes, only nodes itself may be changed.
//
//Example 1:
//
//Given 1->2->3->4, reorder it to 1->4->2->3.


package wenxinjie2;

public class leetcode143_Reorder_List {
    public void reorderList(ListNode head) {
        if (head != null && head.next != null){
            ListNode slow = head, fast = head, l1 = head;
            while (fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode mid = slow, l2 = slow.next;
            mid.next = null;
            l2 = helper(l2);
            while (l1 != null && l2 != null){
                ListNode tem = l1.next;
                l1.next = l2;
                l2 = l2.next;
                l1.next.next = tem;
                l1 = tem;                    
            }
        }
    }
    
    public ListNode helper(ListNode head){
        ListNode newhead = null;
        while (head != null){
            ListNode tem = head.next;
            head.next = newhead;
            newhead = head;
            head  = tem;
        }
        return newhead;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty:  medium 