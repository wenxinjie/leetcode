//
//Given a binary tree, find its maximum depth.
//
//The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Given binary tree [3,9,20,null,null,15,7],
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its depth = 3.

package wenxinjie1;

import java.util.Stack;

public class leetcode104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        int res = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) return 0;
        stack.add(root);
        while (!stack.empty()){
            Stack<TreeNode> temp = new Stack<TreeNode>();
            for (TreeNode node : stack){
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            stack = temp;
            res += 1;
        }
        return res;      
    }

}

//Time: O(n)
//Space: O(n)
//Difficulty: medium