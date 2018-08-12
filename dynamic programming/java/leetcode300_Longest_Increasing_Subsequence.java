//
//Given an unsorted array of integers, find the length of longest increasing subsequence.
//
//Example:
//
//Input: [10,9,2,5,3,7,101,18]
//Output: 4 
//Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
//Note:
//
//There may be more than one LIS combination, it is only necessary for you to return the length.
//Your algorithm should run in O(n2) complexity.


package wenxinjie3;

public class leetcode300_Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {      
        int n = nums.length, res = 0;
        if (n == 0) return 0;
        int[] dp = new int[n+1];
        dp[1] = 1;
        
        for (int i = 0; i < n; i++){
            int tem = 0;
            for (int j = 0; j < i; j++){
                if (nums[j] < nums[i]){
                    tem = Math.max(tem, dp[j]);
                }
            }
            dp[i] = tem + 1;
            res = Math.max(dp[i], res);
        }
        return res;
    }
}

//Time: O(n^2)
//Space: O(n)
//Difficulty: medium 