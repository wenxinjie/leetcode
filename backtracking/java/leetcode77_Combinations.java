//
//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//Example:
//
//Input: n = 4, k = 2
//Output:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//]

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;

public class leetcode77_Combinations {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res, new ArrayList<Integer>(), n, k, 1);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int n, int k, int index){
        if (k == 0) {
            res.add(new ArrayList<Integer>(cur));
            return ;
        }
        for (int i = index; i < n + 1; i ++ ){
            cur.add(i);
            helper(res, cur, n , k - 1, i + 1);
            cur.remove(cur.size()-1);                
        }
    }   
}

//Time: O(n^k)
//Space: O(k * n ^ k)
//Difficulty: medium