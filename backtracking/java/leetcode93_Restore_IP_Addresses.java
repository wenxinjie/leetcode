//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//Example:
//
//Input: "25525511135"
//Output: ["255.255.11.135", "255.255.111.35"]

package wenxinjie1;

import java.util.ArrayList;
import java.util.List;

public class leetcode93_Restore_IP_Addresses {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> res = new ArrayList<String>();
        helper(res,"", s, 0 ,0 );
        return res;
    }
    
    public void helper(List<String> res, String cur, String s, int index, int count){
        if (count > 4) return;
        if (count == 4 && index == s.length()){
            res.add(cur);
            return;
        }
        for (int i = 1; i < 4; i ++){
            if (index + i > s.length()) break;
            String tem = s.substring(index, index + i);
            if ((tem.charAt(0) == '0' && tem.length() > 1 ) || (Integer.valueOf(tem) > 255)) continue;
            if (count == 3){
                helper(res, cur + tem, s, index + i, count + 1);
            }
            else{
                helper(res, cur + tem + "." , s, index + i, count + 1);
            }
        }
    }
}

//Time: O(n!)
//Space: O(n)
//Difficulty: medium