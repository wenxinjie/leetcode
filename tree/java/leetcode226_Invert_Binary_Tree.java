//Invert a binary tree.
//
//Example:
//
//Input:
//
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9
//Output:
//
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1

package wenxinjie2;

import java.util.Stack;

public class leetcode226_Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node != null){
                TreeNode tem = node.left;
                node.left = node.right;
                node.right = tem;
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return root;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy