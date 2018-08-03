//Given a collection of distinct integers, return all possible permutations.
//
//Example:
//
//Input: [1,2,3]
//Output:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
//

package wenxinjie;

import java.util.ArrayList;
import java.util.List;

public class leetcode46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] nums){
        if (cur.size() == nums.length)  res.add(new ArrayList<>(cur));
        for (int i: nums){
            if (cur.contains(i)) continue;
            cur.add(i);
            helper(res, cur, nums);
            cur.remove(cur.size()-1);              
        }
    }
	
}

//Time: O(n!)
//Space: O(n * n!)
//Difficulty: medium