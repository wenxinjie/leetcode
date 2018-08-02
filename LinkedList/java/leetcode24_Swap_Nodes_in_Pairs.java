//Given a linked list, swap every two adjacent nodes and return its head.
//
//Example:
//
//Given 1->2->3->4, you should return the list as 2->1->4->3.

package wenxinjie;

public class leetcode24_Swap_Nodes_in_Pairs {
	public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode head1 = dummy;
        head1.next = head;
        while (head1.next != null && head1.next.next != null){
            ListNode c = head1.next.next.next, b = head1.next.next, a = head1.next;
            head1.next = b; 
            head1.next.next = a; 
            head1.next.next.next = c;
            head1 = head1.next.next;
        }
        return dummy.next;       
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium