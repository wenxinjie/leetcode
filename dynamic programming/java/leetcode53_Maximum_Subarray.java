//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//Example:
//
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.

package wenxinjie;

public class leetcode53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int dp = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i ++){
            dp = (dp > 0)? dp + nums[i]: nums[i];
            res = Math.max(res, dp);
        }
        return res;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy