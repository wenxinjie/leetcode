//# Reverse a singly linked list.
//
//# Example:
//
//# Input: 1->2->3->4->5->NULL
//# Output: 5->4->3->2->1->NULL


package wenxinjie2;

public class leetcode206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode newhead = null;
        while (head != null){
            ListNode tem = head.next;
            head.next = newhead;
            newhead = head;
            head = tem;
        }
        return newhead;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy