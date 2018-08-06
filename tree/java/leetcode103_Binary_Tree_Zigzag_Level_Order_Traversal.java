//Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its zigzag level order traversal as:
//[
//  [3],
//  [20,9],
//  [15,7]
//]

package wenxinjie1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class leetcode103_Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) return res;
        stack.add(root);
        int flag = 1;
        while (!stack.empty()){
            Stack<TreeNode> temp = new Stack<TreeNode>();
            List<Integer> tem = new ArrayList<Integer>();
            for (TreeNode node : stack){
                tem.add(node.val);
                if (node.left != null) temp.add(node.left);
                if (node.right != null) temp.add(node.right);
            }
            if (flag == 1) res.add(tem);
            else {
                Collections.reverse(tem);
                res.add(tem);
            }
            flag = -flag;
            stack = temp;
        }
        return res;
        
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium