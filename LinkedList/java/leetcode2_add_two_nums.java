package wenxinjie;

// Definition for singly-linked list.
// public class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
// 

public class leetcode2_add_two_nums {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode pre = new ListNode(0);
	        ListNode head = pre;
	        int carry = 0;
	        while (l1 != null || l2 != null || carry != 0){
	            ListNode cur = new ListNode(0);
	            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
	            cur.val = sum % 10;
	            carry = sum / 10;
	            pre.next = cur;
	            pre = cur;        
	            l1 = (l1 == null) ? l1 : l1.next;
	            l2 = (l2 == null) ? l2 : l2.next;    
	        }            
	        return head.next;
	    }
}

//time: O(n)
//space: O(n)
//difficulty: medium