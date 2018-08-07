//
//Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
//
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//Example:
//
//Given the sorted linked list: [-10,-3,0,5,9],
//
//One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5

package wenxinjie1;

public class leetcode109_Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return helper(head, null);
    }
    
    public TreeNode helper(ListNode head, ListNode tail){
        ListNode fast = head, slow = head;
        if (fast == tail) return null;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;          
        }
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(head, slow);
        root.right = helper(slow.next, tail);
        return root;
    }
}

//
//Time: O(n*log(n))
//Space: O(n)
//Difficulty: medium  