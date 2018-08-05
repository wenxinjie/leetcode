//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//Example:
//
//Input: head = 1->4->3->2->5->2, x = 3
//Output: 1->2->2->4->3->5
//
//Definition for singly-linked list.
//class ListNode:
//    def __init__(self, x):
//        self.val = x
//        self.next = None

package wenxinjie1;

public class leetcode86_Partition_List {
	public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        ListNode Point1 = new ListNode(0), Point2 = new ListNode(1);
        ListNode p1 = Point1, p2 = Point2;
        while (head != null){
            if (head.val >= x) {
                p2.next = head;
                p2 = p2.next;
                head = head.next;
            }
            else{
                p1.next = head;
                p1 = p1.next;
                head = head.next;
            }
        }
        p2.next = null;
        p1.next = Point2.next;
        return Point1.next;       
    }
}
//
//Time: O(n)
//Space: O(n)
//Difficulty: medium