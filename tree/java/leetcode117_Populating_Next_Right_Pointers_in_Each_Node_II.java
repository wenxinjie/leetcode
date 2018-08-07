//Given a binary tree
//
//struct TreeLinkNode {
//  TreeLinkNode *left;
//  TreeLinkNode *right;
//  TreeLinkNode *next;
//}
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Note:
//
//You may only use constant extra space.
//Recursive approach is fine, implicit stack space does not count as extra space for this problem.
//Example:
//
//Given the following binary tree,
//
//     1
//   /  \
//  2    3
// / \    \
//4   5    7
//After calling your function, the tree should look like:
//
//     1 -> NULL
//   /  \
//  2 -> 3 -> NULL
// / \    \
//4-> 5 -> 7 -> NULL


package wenxinjie1;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode117_Populating_Next_Right_Pointers_in_Each_Node_II {
    public void connect(TreeLinkNode root) {
    if (root != null){
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Queue<TreeLinkNode> tem = new LinkedList<TreeLinkNode>();
            for (TreeLinkNode node : queue){
                if (node.left != null) tem.offer(node.left);
                if (node.right != null) tem.offer(node.right);                
            }
            TreeLinkNode cur = queue.poll();
            while (cur != null){
                cur.next = queue.peek();
                cur = queue.poll();
            }
            queue = tem;                
        }
    }        
    }
}
//
//Time: O(n)
//Space: O(1)
//Difficulty: medium