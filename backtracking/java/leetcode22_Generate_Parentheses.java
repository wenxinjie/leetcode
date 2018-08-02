//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//
//For example, given n = 3, a solution set is:
//
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]



package wenxinjie;

import java.util.ArrayList;
import java.util.List;

public class leetcode22_Generate_Parentheses {
	
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(res, "", 0, 0, n);
        return res;     
    }
    
    public void helper(List<String> res, String cur, int left, int right, int n){
        if (n * 2 == cur.length()){
            res.add(cur);
            return;
        }
        if (left < n) {
            helper( res, cur + "(" , left + 1, right, n);
        }
        if  (right < left){
            helper(res, cur+ ")" , left, right + 1, n);
        }
    }
}

//Time: O(2^n)
//Space: 
//Difficulty: medium
