//Given preorder and inorder traversal of a tree, construct the binary tree.
//
//Note:
//You may assume that duplicates do not exist in the tree.
//
//For example, given
//
//preorder = [3,9,20,15,7]
//inorder = [9,3,15,20,7]
//Return the following binary tree:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7

package wenxinjie1;

import java.util.Arrays;

public class leetcode105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) { 
        
        if (preorder.length == 0 || inorder.length == 0) return null;
        else{
            int index = 0 ;
            for (int i = 0 ; i < inorder.length;i++){
                if (inorder[i] == preorder[0]){
                    index = i;
                    break;
                }
            }
            TreeNode root = new TreeNode(preorder[0]);
            root.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index ));
            root.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
            return root;
        }     
    }
	
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium