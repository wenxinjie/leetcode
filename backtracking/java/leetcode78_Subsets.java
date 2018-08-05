//Given a set of distinct integers, nums, return all possible subsets (the power set).
//
//Note: The solution set must not contain duplicate subsets.
//
//Example:
//
//Input: nums = [1,2,3]
//Output:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;

public class leetcode78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) return res;
        helper(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int index){
        res.add(new ArrayList<>(cur));
        for (int i = index; i < nums.length ; i ++){
            cur.add(nums[i]);
            helper(res, cur, nums, i+1);
            cur.remove(cur.size() - 1);
        }
    }
}


//Time: O(2 ^ n)
//Space: O(n * 2 ^ n)
//Difficulty: medium