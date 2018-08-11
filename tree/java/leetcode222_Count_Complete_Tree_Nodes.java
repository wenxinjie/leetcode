//Given a complete binary tree, count the number of nodes.
//
//Note:
//
//Definition of a complete binary tree from Wikipedia:
//In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
//
//Example:
//
//Input: 
//    1
//   / \
//  2   3
// / \  /
//4  5 6
//
//Output: 6

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode222_Count_Complete_Tree_Nodes {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int level = 1;
        TreeNode left = root.left;
        while (left != null){
            left = left.left;
            level ++;                
        }
                            
        List<Integer> path = helper(root, new ArrayList<Integer>());
        int bottom = 0;
        for (int i = 0; i < path.size(); i++){
            if (path.get(i) == 1){
                bottom += (int)Math.pow(2, level - i - 2);
            }
        }
        return bottom + 1 + (int)Math.pow(2, level-1) - 1;
    }
    
    public List<Integer> helper(TreeNode root, List<Integer> path){
        TreeNode left = root.left, right = root.right;
        if (right == null && left == null) return path;
        int r = 0, l = 0;
        while (left != null){
            left = left.left;
            l ++;
        }
        while (right!= null){
            right = right.left;
            r ++;
        }
        if(l == r) {
            path.add(1);
            return helper(root.right, path);
        }
        else {
            path.add(0);
            return helper(root.left, path);
        }           
    }
}

//Time: O(m+n)
//Space: O(n)
//Difficulty: medium



