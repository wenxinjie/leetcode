//Reverse a linked list from position m to n. Do it in one-pass.
//
//Note: 1 ≤ m ≤ n ≤ length of list.
//
//Example:
//
//Input: 1->2->3->4->5->NULL, m = 2, n = 4
//Output: 1->4->3->2->5->NULL

package wenxinjie1;

public class leetcode92_Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = dummy.next;
        for (int i = 0 ; i < m -1 ; i ++){
            pre = pre.next;
            cur = cur.next;
        }
        
        for (int i = 0; i < n - m; i ++){
            ListNode tem = cur.next;
            cur.next = tem.next;
            tem.next = pre.next;
            pre.next = tem;
        }
        return dummy.next;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium