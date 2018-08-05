//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
//
//Example 1:
//
//Input: 1->2->3->3->4->4->5
//Output: 1->2->5
//Example 2:
//
//Input: 1->1->1->2->3
//Output: 2->3

package wenxinjie1;

public class leetcode82_Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(131234);
        ListNode p = dummy;
        dummy.next = head;
        while (p.next != null && p.next.next != null){
            if (p.next.val == p.next.next.val){
                int value = p.next.val;
                while(p.next != null && p.next.val == value){
                    p.next = p.next.next;
                }
            }
            else{
                p = p.next;
            }
        }
        return dummy.next;
    }
}


//Time: O(n)
//Space: O(1)
//Difficulty: medium