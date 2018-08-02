//Given a linked list, remove the n-th node from the end of list and return its head.
//
//Example:
//
//Given linked list: 1->2->3->4->5, and n = 2.
//
//After removing the second node from the end, the linked list becomes 1->2->3->5.

package wenxinjie;

public class leetcode19_Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = slow, head1 = slow;
        for (int i = 0 ; i <= n; i ++) fast = fast.next;
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head1.next;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium