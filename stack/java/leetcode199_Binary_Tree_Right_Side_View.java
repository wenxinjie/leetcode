//Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
//
//Example:
//
//Input: [1,2,3,null,5,null,4]
//Output: [1, 3, 4]
//Explanation:
//
//   1            <---
// /   \
//2     3         <---
// \     \
//  5     4       <---

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode199_Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(root);
        while (!stack.empty()){
            res.add(stack.peek().val);
            Stack<TreeNode> tem = new Stack<TreeNode>();
            for (TreeNode node : stack){
                if (node.left != null) tem.push(node.left);
                if (node.right != null) tem.push(node.right);
            }
            stack = tem;
        }
        return res;       
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium