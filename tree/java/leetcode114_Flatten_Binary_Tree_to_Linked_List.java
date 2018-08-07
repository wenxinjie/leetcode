//Given a binary tree, flatten it to a linked list in-place.
//
//For example, given the following tree:
//
//    1
//   / \
//  2   5
// / \   \
//3   4   6
//The flattened tree should look like:
//
//1
// \
//  2
//   \
//    3
//     \
//      4
//       \
//        5
//         \
//          6


package wenxinjie1;

import java.util.Stack;

public class leetcode114_Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode curr = stack.pop();
            if (curr.right!=null)  
                 stack.push(curr.right);
            if (curr.left!=null)  
                 stack.push(curr.left);
            if (!stack.empty()) 
                 curr.right = stack.peek();
            curr.left = null;  
        }  
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium