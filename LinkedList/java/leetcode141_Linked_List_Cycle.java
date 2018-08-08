//
//Given a linked list, determine if it has a cycle in it.
//
//Follow up:
//Can you solve it without using extra space?


package wenxinjie2;

public class leetcode141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy