//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true

package wenxinjie2;

import java.util.HashMap;

public class leetcode219_Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length; i ++){
            if (map.containsKey(nums[i])){
                if (i - map.get(nums[i]) <= k) return true;
                else map.replace(nums[i], i);
            }
            else map.put(nums[i], i);
        }
        return false;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy