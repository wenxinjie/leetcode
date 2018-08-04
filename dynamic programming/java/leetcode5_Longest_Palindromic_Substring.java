//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Example 1:
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//Input: "cbbd"
//Output: "bb"

package wenxinjie;

public class leetcode5_Longest_Palindromic_Substring {
	public String longestPalindrome1(String s){
        int n = s.length();
        if (n < 2) 
            return s;        
        boolean[][] dp = new boolean[n][n];
        String  res = "";
        for (int i = n - 1; i >= 0 ; i --){
            for (int j = i; j < n ; j ++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && j - i + 1 > res.length()){
                    res = s.substring(i,j+1);
                }                    
            }
        }
        return res;      
    }
	
//space: O(n^2)
//time: O(n^2)
//difficulty: medium
    
    public String longestPalindrome2(String s) {
        if (s.length() < 2 ) return s;        
        for (int i = 0; i < s.length();i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }      
        return res;
    }
    private String res = "";
    public void helper(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }        
        if (right - left - 1  > res.length()){
            res = s.substring(left + 1, right);
        }
    }
}
//time: O(n^2)
//space: O(1)


