//Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
//
//Note:
//
//All numbers will be positive integers.
//The solution set must not contain duplicate combinations.
//Example 1:
//
//Input: k = 3, n = 7
//Output: [[1,2,4]]
//Example 2:
//
//Input: k = 3, n = 9
//Output: [[1,2,6], [1,3,5], [2,3,4]]

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode216_Combination_Sum_III {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        helper(res, new ArrayList<Integer>(), k, n, nums, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int k, int n, int[] nums, int index){       
        if (n == 0 && k == 0) {
            res.add(new ArrayList<Integer>(cur));
            return ;
        }
        if (n < 0 || index >= nums.length) return;
        for(int i = index ; i <nums.length; i++){
            cur.add(nums[i]);
            helper(res, cur,k-1, n- nums[i],nums , i+1);
            cur.remove(cur.size()-1);
        }      
    }
}
//
//Time: O(n^k)
//Space: O(n * n^k)
//Difficulty: medium