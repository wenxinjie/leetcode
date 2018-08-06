//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its bottom-up level order traversal as:
//[
//  [15,7],
//  [9,20],
//  [3]
//]
//

package wenxinjie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class leetcode107_Binary_Tree_Level_Order_Traversal_II {

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
        Collections.reverse(res);
        return res;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy 