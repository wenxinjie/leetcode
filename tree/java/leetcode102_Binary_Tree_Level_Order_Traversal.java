//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) return res;
        stack.add(root);
        while (!stack.empty()){
            Stack<TreeNode> temp = new Stack<TreeNode>();
            List<Integer> tem = new ArrayList<Integer>();
            for (TreeNode node : stack){
                tem.add(node.val);
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            res.add(tem);
            stack = temp;
        }
        return res;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium