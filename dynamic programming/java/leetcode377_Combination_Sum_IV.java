//Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.
//
//Example:
//
//nums = [1, 2, 3]
//target = 4
//
//The possible combination ways are:
//(1, 1, 1, 1)
//(1, 1, 2)
//(1, 2, 1)
//(1, 3)
//(2, 1, 1)
//(2, 2)
//(3, 1)
//
//Note that different sequences are counted as different combinations.
//
//Therefore the output is 7.

package wenxinjie4;

import java.util.Arrays;

public class leetcode377_Combination_Sum_IV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        Arrays.sort(nums);
        for (int i = 0; i < target + 1; i ++){
            for (int num : nums){
                if (i < num) break;
                dp[i] += dp[i - num];
            }
        }
        return dp[target];
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium