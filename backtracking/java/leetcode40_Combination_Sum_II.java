//Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
//
//Each number in candidates may only be used once in the combination.
//
//Note:
//
//All numbers (including target) will be positive integers.
//The solution set must not contain duplicate combinations.
//Example 1:
//
//Input: candidates = [10,1,2,7,6,1,5], target = 8,
//A solution set is:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]


package wenxinjie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode40_Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] candidates, int target, int index){
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }        
        for (int i = index; i < candidates.length; i++){
            if (i != index && candidates[i] == candidates[i-1]) continue;
            else{
            cur.add(candidates[i]);
            helper(res, cur, candidates, target - candidates[i], i + 1);
            cur.remove(cur.size() - 1);
            }              
        }
    }	
}

//Time: kO(k^n)
//Space: O(n)
//Difficulty: medium