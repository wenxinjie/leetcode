//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//Example 1:
//
//Input: 1->1->2
//Output: 1->2
//Example 2:
//
//Input: 1->1->2->3->3
//Output: 1->2->3

package wenxinjie1;

public class leetcode83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (head == null) return head;
        while(p != null && p.next != null){
            while (p.next != null && p.val == p.next.val){
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy