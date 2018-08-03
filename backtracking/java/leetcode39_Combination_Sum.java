//Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
//
//The same repeated number may be chosen from candidates unlimited number of times.
//
//Note:
//
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.
//Example 1:
//
//Input: candidates = [2,3,6,7], target = 7,
//A solution set is:
//[
//  [7],
//  [2,2,3]
//]

package wenxinjie;

import java.util.ArrayList;
import java.util.List;

public class leetcode39_Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> cur, int[] candidates, int target, int index) {
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = index;i<candidates.length;i++){
            cur.add(candidates[i]);
            helper(res,cur,candidates,target-candidates[i],i);
            cur.remove(cur.size()-1);
        }
    }	
}

//
//Time: kO(k^n)
//Space: O(n)
//Difficulty: medium