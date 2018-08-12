//Given a binary tree, return all root-to-leaf paths.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Input:
//
//   1
// /   \
//2     3
// \
//  5
//
//Output: ["1->2->5", "1->3"]
//
//Explanation: All root-to-leaf paths are: 1->2->5, 1->3

package wenxinjie3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode257_Binary_Tree_Paths {
    public List<String> binaryTreePaths(TreeNode root) {
//    	dfs
        List<String> res = new ArrayList<String>();
        if (root == null) return res;
        helper(res, "", root);
        return res;
    }
    
    public void helper(List<String> res, String cur, TreeNode root){
        if (root.left == null && root.right == null){
            cur += String.valueOf(root.val);
            res.add(cur);
            return;
        }
        if (root.left != null){           
            helper(res, cur + String.valueOf(root.val) + "->", root.left);
        }
        if (root.right != null){           
            helper(res,cur + String.valueOf(root.val) + "->",root.right);
        }
    }
    
    
    
    
    public List<String> binaryTreePaths2(TreeNode root) {
//        bfs
    List<String> res=new ArrayList<String>();
    Queue<TreeNode> qNode=new LinkedList<TreeNode>();
    Queue<String> qStr=new LinkedList<String>();
    
    if (root==null) return res;
    qNode.offer(root);
    qStr.offer("");
        
    while(!qNode.isEmpty()) {
        TreeNode node = qNode.poll();
        String cur = qStr.poll();
        
        if (node.left == null && node.right == null)  res.add(cur + node.val);
        if (node.left != null) {
            qNode.add(node.left);
            qStr.add(cur+node.val+"->");
        }
        if (node.right!=null) {
            qNode.add(node.right);
            qStr.add(cur+node.val+"->");
        }
    }
    return res;
    }
}

//Time: O(m+n)
//Space: O(m+n)
//Difficulty: easy