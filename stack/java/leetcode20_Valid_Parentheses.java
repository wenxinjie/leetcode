//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true

package wenxinjie;

import java.util.Stack;

public class leetcode20_Valid_Parentheses {	
    public boolean isValid(String s) {
        int n = s.length();
        if (n == 0 || s == null) return true;
        if (n % 2 != 0) return false;
        if (s.charAt(0) == ')' ||s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        Stack<Character> res = new Stack<Character>();
        for (char c: s.toCharArray()){
            if (c == '(' ) res.push(')');
            else if (c == '[') res.push(']');
            else if (c == '{') res.push('}');
            else if (res.isEmpty() || c != res.pop()) return false;
        }
        return res.isEmpty();
    }

}

//Time: O(n)
//Space: O(1)
//Difficulty: easy