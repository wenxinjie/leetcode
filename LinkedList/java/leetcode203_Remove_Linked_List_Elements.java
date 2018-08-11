//Remove all elements from a linked list of integers that have value val.
//
//Example:
//
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5

package wenxinjie2;

public class leetcode203_Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while (p != null && p.next != null){
            if (p.next != null && p.next.val == val){
                while (p.next!=null && p.next.val == val){
                    p.next = p.next.next;
                }
            }
            p = p.next;
        }
        return dummy.next;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy
