//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//Example:
//
//Input: "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

package wenxinjie;

import java.util.LinkedList;
import java.util.List;

public class leetcode17_Letter_Combinations_of_a_Phone_Number {	
    private static final String[] pool = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {       
        List<String> res = new  LinkedList<String>();
        if (digits == null || digits.length() == 0) return res;
        helper("", digits, res, 0);
        return res;      
    }     
    public void helper(String prefix, String digits, List<String>res, int offset){
        if (offset >= digits.length()){
            res.add(prefix);
            return ;
        }
        String strs = pool[digits.charAt(offset) - '0'];        
        for (int i = 0; i < strs.length(); i ++){
            helper(prefix + strs.charAt(i), digits, res, offset + 1);
        }       
    }
}


//Time: O(n^2)
//Space: O(3^n)
//Difficulty: medium