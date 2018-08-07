//
//Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Given the below binary tree and sum = 22,
//
//      5
//     / \
//    4   8
//   /   / \
//  11  13  4
// /  \    / \
//7    2  5   1
//Return:
//
//[
//   [5,4,11,2],
//   [5,8,4,5]
//]

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;

public class leetcode113_Path_Sum_II {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res; 
        List<Integer> path = new ArrayList<Integer>();
        helper(root, path, sum);
        return res;
    }
    
    public void helper(TreeNode node, List<Integer> path, int sum){
        path.add(node.val);
        if (node.left == null && node.right == null){
            if (sum == node.val) {
                res.add(new ArrayList<Integer>(path)); 
                return;
            }
        }
        if (node.left != null) 
            helper(node.left, path, sum-node.val);
        if (node.right != null) 
            helper(node.right, path, sum-node.val);
        path.remove(path.size()-1);
    }
}

//Time: O(m + n)
//Space: O(m + n)
//Difficulty: medium