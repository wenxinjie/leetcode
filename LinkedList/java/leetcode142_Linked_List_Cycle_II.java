//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//Note: Do not modify the linked list.
//
//Follow up:
//Can you solve it without using extra space?

package wenxinjie2;

public class leetcode142_Linked_List_Cycle_II {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode fast = head.next.next, slow = head.next;
        while (fast!= null && fast.next!= null && fast != slow){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast == null || fast.next == null) return null;
        ListNode h = head;
        while (h != slow ){
            slow = slow.next;
            h = h.next;
        }
        return slow;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium 