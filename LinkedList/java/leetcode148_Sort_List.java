//Sort a linked list in O(n log n) time using constant space complexity.
//
//Example 1:
//
//Input: 4->2->1->3
//Output: 1->2->3->4
//Example 2:
//
//Input: -1->5->3->4->0
//Output: -1->0->3->4->5

package wenxinjie2;

public class leetcode148_Sort_List {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = getMid(head);
        ListNode head2 = mid.next;
        mid.next = null; 
        return merge(sortList(head), sortList(head2));       
    }
    
    public ListNode getMid(ListNode head){
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    
    public ListNode merge(ListNode l, ListNode r){
        if (l.val >= r.val){
            ListNode tem = l; l = r; r = tem;
        }
        ListNode p = l;
        while (l != null && l.next != null && r != null){
            if (l.val <= r.val && r.val <= l.next.val){
                ListNode tem1 = r.next;
                r.next = l.next;
                l.next = r;
                r = tem1;
                l = l.next;                   
            }
            else if (r.val > l.next.val) l = l.next;
        }
        if (l.next == null) l.next = r;
        return p;
    }
}

//Time: O(nlog(n))
//Space: O(1) 
//Difficulty: medium
