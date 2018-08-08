//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
//
//An example is the root-to-leaf path 1->2->3 which represents the number 123.
//
//Find the total sum of all root-to-leaf numbers.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Input: [1,2,3]
//    1
//   / \
//  2   3
//Output: 25
//Explanation:
//The root-to-leaf path 1->2 represents the number 12.
//The root-to-leaf path 1->3 represents the number 13.
//Therefore, sum = 12 + 13 = 25.

package wenxinjie2;

public class leetcode129_Sum_Root_to_Leaf_Numbers {
    private int res = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        helper(root, root.val);
        return res;
    }
    
    public void helper(TreeNode root, int cur){
        if (root.left == null && root.right == null){
            res += cur;
            return;
        }
        if (root.left!=null) helper(root.left, cur*10+root.left.val);
        if (root.right!=null) helper(root.right, cur*10+root.right.val);
    }
}

//Time:O(n+m)
//Space: O(m+n)
//Difficulty: medium