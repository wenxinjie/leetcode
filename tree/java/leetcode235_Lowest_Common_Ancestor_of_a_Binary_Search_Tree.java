//
//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
//
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
//
//Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
//
//        _______6______
//       /              \
//    ___2__          ___8__
//   /      \        /      \
//   0      _4       7       9
//         /  \
//         3   5
//Example 1:
//
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.
//Example 2:
//
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//Output: 2
//Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself 
//             according to the LCA definition.

package wenxinjie2;

public class leetcode235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if (root.val > p.val && root.val > q.val) root = root.left;
            else if (root.val < q.val && root.val < p.val) root = root.right;
            else return root;
        }
        return null;
    }
}

//Time: O(n+m)
//Space: O(1)
//Difficulty: easy