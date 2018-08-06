//Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
//
//Note: The solution set must not contain duplicate subsets.
//
//Example:
//
//Input: [1,2,2]
//Output:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//]


package wenxinjie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode90_Subsets_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res  = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, int index){
        res.add(new ArrayList<>(cur));
        for (int i = index; i < nums.length; i ++){
            if (i > index && nums[i] == nums[i-1]) continue;
            cur.add(nums[i]);
            helper(res, cur, nums, i+1);
            cur.remove(cur.size()-1);
        }
    }
}

//Time: O(2^n)
//Space: O(2 ^ n)
//Difficulty: medium