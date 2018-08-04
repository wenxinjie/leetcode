//Given a linked list, rotate the list to the right by k places, where k is non-negative.
//
//Example 1:
//
//Input: 1->2->3->4->5->NULL, k = 2
//Output: 4->5->1->2->3->NULL
//Explanation:
//rotate 1 steps to the right: 5->1->2->3->4->NULL
//rotate 2 steps to the right: 4->5->1->2->3->NULL
//Example 2:
//
//Input: 0->1->2->NULL, k = 4
//Output: 2->0->1->NULL
//Explanation:
//rotate 1 steps to the right: 2->0->1->NULL
//rotate 2 steps to the right: 1->2->0->NULL
//rotate 3 steps to the right: 0->1->2->NULL
//rotate 4 steps to the right: 2->0->1->NULL

package wenxinjie;

public class leetcode61_Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n = 1;
        ListNode p = head;
        while(p.next != null){
            p = p.next;
            n ++;
        }
        int m = n - k % n - 1;
        p.next = head;
        while (m >= 0){
            head = head.next;
            p = p.next;
            m--;
        }
        p.next = null;
        return head;       
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium 