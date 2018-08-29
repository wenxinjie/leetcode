//Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
//
//You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
//
//Example 1:
//
//Input: 1->2->3->4->5->NULL
//Output: 1->3->5->2->4->NULL
//Example 2:
//
//Input: 2->1->3->5->6->4->7->NULL
//Output: 2->3->6->7->1->5->4->NULL

package wenxinjie3;

public class leetcode328_Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1), even = new ListNode(-1);
        ListNode point1 = odd, point2 = even;
        
        while (head != null){
            point1.next = head;
            point1 = point1.next;
            head = head.next;
            if (head != null){
                point2.next = head;
                point2 = point2.next;
                head = head.next;
            }
        }
        point1.next = even.next;
        point2.next = null;
        return odd.next;       
    }
	
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium