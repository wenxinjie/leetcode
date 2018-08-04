//Given a collection of numbers that might contain duplicates, return all possible unique permutations.
//
//Example:
//
//Input: [1,1,2]
//Output:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//]

package wenxinjie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode47_Permutations_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] used){
        if (cur.size() == nums.length){
            res.add(new ArrayList<>(cur));
            return ; 
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i] || i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            cur.add(nums[i]);
            used[i] = true;
            helper(res, cur, nums, used);
            cur.remove(cur.size()-1);
            used[i] = false;                
        }
    } 
}

//Time: O(n!)
//Space: O(n!*n)
//Difficulty: medium