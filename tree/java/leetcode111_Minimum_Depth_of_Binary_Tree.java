//Given a binary tree, find its minimum depth.
//
//The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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

package wenxinjie1;

import java.util.Stack;

public class leetcode111_Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int count = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);
        while (true){
            Stack<TreeNode> tem = new Stack<TreeNode>();
            count++;
            for (TreeNode node: stack){
                if (node.left == null && node.right == null) return count;
                if (node.left != null) tem.add(node.left);
                if (node.right != null) tem.add(node.right);                
            }
            stack = tem;
        }
    }
}

//Time:O(n)
//Space: O(n)
//Difficulty: easy 