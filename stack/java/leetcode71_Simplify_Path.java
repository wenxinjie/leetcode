//Given an absolute path for a file (Unix-style), simplify it.
//
//For example,
//path = "/home/", => "/home"
//path = "/a/./b/../../c/", => "/c"
//
//Corner Cases:
//
//Did you consider the case where path = "/../"?
//In this case, you should return "/".
//Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
//In this case, you should ignore redundant slashes and return "/home/foo".


package wenxinjie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode71_Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pool = path.split("/");
        
        for (String s: pool){
            if (s.equals("..")) {
                if (!stack.empty()) stack.pop();                    
            }
            else if (!s.equals("") &&  !s.equals(".")) stack.push(s);
        }
        
        List<String> res = new ArrayList<>(stack);
        if (res.size() == 0) return "/";
        else 
            return  "/" + String.join("/", res);           
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium