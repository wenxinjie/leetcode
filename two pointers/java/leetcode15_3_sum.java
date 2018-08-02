//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//
//The solution set must not contain duplicate triplets.
//
//Example:
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]

package wenxinjie;

import java.util.Arrays;
import java.util.LinkedList;

public class leetcode15_3_sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = -nums[i], low = i + 1, high = nums.length - 1;
            while (low < high){
            if (nums[low] + nums[high] == target){
                res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                while (low < high && nums[low] == nums[low + 1]){
                    low ++;
                }
                while (low < high && nums[high] == nums[high - 1]){
                    high --;
                }
                low ++;
                high --;
            }
            else if (nums[low] + nums[high] > target){
                high --;
            }
            else{
                low ++;
            }
          }
        }
        return res;       
    }
}


//
//Time: O(n^2)
//Space: O(n)
//Difficulty: medium
