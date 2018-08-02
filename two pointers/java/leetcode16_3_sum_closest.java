//Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
//Example:
//
//Given array nums = [-1, 2, 1, -4], and target = 1.
//
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

package wenxinjie;

import java.util.Arrays;

public class leetcode16_3_sum_closest {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0 ; i < nums.length - 2; i ++){
            int p1 = i + 1, p2 = nums.length - 1;
            while (p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum > target) p2 -= 1;
                else if (sum < target) p1 += 1;
                else return sum;                
                if (Math.abs(sum - target) < Math.abs(res- target)) res = sum;
             }
        }
        return res;
    }
}


//Time: O(n^2)
//Space: O(n)
//Difficulty: medium