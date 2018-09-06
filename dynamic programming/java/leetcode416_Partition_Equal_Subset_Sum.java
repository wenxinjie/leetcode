//Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.
//
//Note:
//Each of the array element will not exceed 100.
//The array size will not exceed 200.
//Example 1:
//
//Input: [1, 5, 11, 5]
//
//Output: true
//
//Explanation: The array can be partitioned as [1, 5, 5] and [11].

package wenxinjie4;

import java.util.Arrays;

public class leetcode416_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        
        int a = sum(nums);
        
        if (a % 2 != 0) return false;
        
        int target = a / 2;
        
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        
        Arrays.sort(nums);
        for (int num: nums){
            for (int i = target; i >=0 ; i --){
                if (i < num) break;
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[target];
        
    }
    
    public int sum(int[] nums){
        int res = 0;
        for (int num : nums){
            res += num;
        }
        return res;
    }
}

//Time: O(n * k)
//Space: O(n)
//Difficulty: medium