//Given a singly linked list, determine if it is a palindrome.
//
//Example 1:
//
//Input: 1->2
//Output: false
//Example 2:
//
//Input: 1->2->2->1
//Output: true

package wenxinjie2;

public class leetcode234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) slow = slow.next;
        ListNode newhead = null;
        while (slow != null){
            ListNode tem = slow.next;
            slow.next = newhead;
            newhead = slow;
            slow = tem;
        }
        
        while (head != null && newhead != null){
            if (head.val!=newhead.val) return false;
            head = head.next;
            newhead = newhead.next;
        }
        return true;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium



