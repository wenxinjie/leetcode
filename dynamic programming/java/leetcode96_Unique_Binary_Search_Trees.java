//
//Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?
//
//Example:
//
//Input: 3
//Output: 5
//Explanation:
//Given n = 3, there are a total of 5 unique BST's:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3

package wenxinjie1;

public class leetcode96_Unique_Binary_Search_Trees {
    public int numTrees(int n) {
        int[] res = new int[n+1];
        res[0] = 1;
        for (int i = 1; i < n+1; i ++){
            for (int j = 0; j < i ; j ++){
                res[i] += res[j] * res[i - j - 1];
            }
        }
        return res[res.length - 1];
    }
}
//
//Time: O(n^2)
//Space: O(n)
//Difficulty: medium
