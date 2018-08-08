//Given a string s, partition s such that every substring of the partition is a palindrome.
//
//Return the minimum cuts needed for a palindrome partitioning of s.
//
//Example:
//
//Input: "aab"
//Output: 1
//Explanation: The palindrome partitioning ["aa","b"] could be produced using 1 cut.

package wenxinjie2;

public class leetcode132_Palindrome_Partitioning_II {
    public int minCut(String s) {       
        char[] c = s.toCharArray();
        int n = c.length;
        int[] cut = new int[n];
        boolean[][] pal = new boolean[n][n];
        for(int i = 0; i < n; i ++){
            int min = i ;
            for (int j = 0; j <= i; j ++){
                if ((c[i] == c[j]) && ( j + 1 > i - 1 || pal[j+1][i-1] ) ){
                    pal[j][i] = true;
                    min = j==0? 0: Math.min(min, cut[j-1] + 1);
                }
            }
            cut[i] = min;            
        }
        return cut[n-1];      
    }
}

//Time: O(n^2)
//Space: O(n^2)
//Difficulty: medium