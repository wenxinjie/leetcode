//Implement a basic calculator to evaluate a simple expression string.
//
//The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
//
//Example 1:
//
//Input: "3+2*2"
//Output: 7
//Example 2:
//
//Input: " 3/2 "
//Output: 1
//Example 3:
//
//Input: " 3+5 / 2 "
//Output: 5


package wenxinjie2;

import java.util.Stack;

public class leetcode227_Basic_Calculator_II {
    public int calculate(String s) {
        s.trim();
        if (s == null || s.length() == 0) return 0;
        
        int num = 0;
        char sign = '+' ;
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0 ; i < s.length(); i++){
            if (Character.isDigit(s.charAt(i))) num = num * 10 + s.charAt(i) - '0';
            if ( (!Character.isDigit(s.charAt(i)) && !Character.isSpace(s.charAt(i))) || i == s.length() - 1){
                if (sign =='+') stack.push(num);
                else if (sign == '-') stack.push(-num);
                else if (sign == '*') stack.push(stack.pop() * num);
                else if (sign == '/') stack.push(stack.pop() / num);
                
                sign = s.charAt(i);
                num = 0;                
            }
        }
        
        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty:  medium