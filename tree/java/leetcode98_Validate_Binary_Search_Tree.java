//Given a binary tree, determine if it is a valid binary search tree (BST).
//
//Assume a BST is defined as follows:
//
//The left subtree of a node contains only nodes with keys less than the node's key.
//The right subtree of a node contains only nodes with keys greater than the node's key.
//Both the left and right subtrees must also be binary search trees.
//Example 1:
//
//Input:
//    2
//   / \
//  1   3
//Output: true

package wenxinjie1;

import java.util.Stack;

public class leetcode98_Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        int res = -13249;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (res != -13249){
                if (res >= cur.val) return false;
            }
            res = cur.val;
            cur = cur.right;
        }
        return true;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium