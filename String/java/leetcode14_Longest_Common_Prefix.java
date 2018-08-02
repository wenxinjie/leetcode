//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.


package wenxinjie;

import java.util.Arrays;

public class leetcode14_Longest_Common_Prefix {
	public String longestCommonPrefix1(String[] strs) {
//		using string array
        if (strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length - 1];
        for (int i = 0; i < a.length();i++){
            if (a.charAt(i) != b.charAt(i)){
                return a.substring(0,i);
            }
        }
        return a;}
	
	 public String longestCommonPrefix2(String[] strs) {		 
//		 using stringbuilder
		 StringBuilder result = new StringBuilder();
	        
	        if (strs!= null && strs.length > 0){	        
	            Arrays.sort(strs);	            
	            char [] a = strs[0].toCharArray();
	            char [] b = strs[strs.length-1].toCharArray();	            
	            for (int i = 0; i < a.length; i ++){
	                if (i < b.length && b[i] == a[i]){
	                    result.append(b[i]);
	                }
	                else {
	                    return result.toString();
	                }
	            }	       
	    }
	         return result.toString();		 
	 }
}

//Time: O(1)
//Space: O(1)
//Difficulty: easy
//
//you only need to compare the first one and  the last one after sorting, since there are most difference between those two.