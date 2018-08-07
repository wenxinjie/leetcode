//
//Given a binary tree, determine if it is height-balanced.
//
//For this problem, a height-balanced binary tree is defined as:
//
//a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
//
//Example 1:
//
//Given the following tree [3,9,20,null,null,15,7]:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//Return true.

package wenxinjie1;

public class leetcode110_Balanced_Binary_Tree {
    private boolean flag = true;   
    public boolean isBalanced(TreeNode root) {
        
        if (root == null) return true;  
        helper(root);
        return flag;
    }
    
    public int helper(TreeNode root){
        if (root == null) 
            return 0;
        int a = helper(root.left);
        int b = helper(root.right);
        if (Math.abs(a-b) > 1) 
            flag = false;
        return Math.max(a,b) + 1;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy    