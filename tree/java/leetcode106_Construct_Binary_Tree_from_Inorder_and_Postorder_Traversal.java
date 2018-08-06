//Given inorder and postorder traversal of a tree, construct the binary tree.
//
//Note:
//You may assume that duplicates do not exist in the tree.
//
//For example, given
//
//inorder = [9,3,15,20,7]
//postorder = [9,15,7,20,3]
//Return the following binary tree:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7

package wenxinjie1;

import java.util.Arrays;

public class leetcode106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;
        else{
            int index = 0 ;
            for (int i = 0 ; i < inorder.length;i++){
                if (inorder[i] == postorder[postorder.length-1]){
                    index = i;
                    break;
                }
            }
            TreeNode root = new TreeNode(inorder[index]);
            root.left = buildTree(Arrays.copyOfRange(inorder, 0, index ), Arrays.copyOfRange(postorder, 0, index));
            root.right = buildTree(Arrays.copyOfRange(inorder, index+1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length-1));
            return root;
        }     
    }
}

//Time:O(n)
//Space: O(n)
//Difficulty: medium