//Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1 ... n.
//
//Example:
//
//Input: 3
//Output:
//[
//  [1,null,3,2],
//  [3,2,null,1],
//  [3,1,null,null,2],
//  [2,1,3],
//  [1,null,2,null,3]
//]
//Explanation:
//The above output corresponds to the 5 unique BST's shown below:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;

public class leetcode95_Unique_Binary_Search_Trees_II {
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) return new ArrayList<TreeNode>();
        return generate(1,n);
    }
    
    public List<TreeNode> generate(int start, int end){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (start > end){ res.add(null); }
        for (int i = start; i < end + 1; i ++){
            List<TreeNode> leftnode = generate(start, i-1);
            List<TreeNode> rightnode = generate(i+1, end);
            for (TreeNode l: leftnode){
                for (TreeNode r: rightnode){
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    res.add(node);                   
                }
            }
        }
        return res;
    }
}


//Time: O(n^2)
//Space: O(n^3)
//Difficulty: medium