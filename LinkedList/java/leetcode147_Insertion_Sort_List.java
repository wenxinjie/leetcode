//Sort a linked list using insertion sort.
//
//Algorithm of Insertion Sort:
//
//Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
//At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
//It repeats until no input elements remain.
//
//Example 1:
//
//Input: 4->2->1->3
//Output: 1->2->3->4

package wenxinjie2;

public class leetcode147_Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = null, cur = head, tem = null;
        while (cur != null && cur.next != null){
            if (cur.val <= cur.next.val) cur = cur.next;
            else {
                tem = cur.next;
                cur.next  = tem.next;
                pre = dummy;
                while (pre.next != null && pre.next.val <= tem.val) pre = pre.next;
                tem.next = pre.next;
                pre.next = tem;            
            }
        }
        return dummy.next;
    }
}
//
//Time: O(n^2)
//Space: O(1)
//Difficulty: medium   