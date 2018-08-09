//Given a list of non negative integers, arrange them such that they form the largest number.
//
//Example 1:
//
//Input: [10,2]
//Output: "210"
//Example 2:
//
//Input: [3,30,34,5,9]
//Output: "9534330"


package wenxinjie2;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode179_Largest_Number {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";

		String[] s = new String[nums.length];
		for(int i = 0; i < nums.length; i++)
		    s[i] = String.valueOf(nums[i]);
			
		Comparator<String> comp = new Comparator<String>(){
		    @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1); 
		        }
	        };
		
		Arrays.sort(s, comp);              
        if(s[0].charAt(0) == '0') return "0";                              
		StringBuilder sb = new StringBuilder();
		for(String s1: s)
	            sb.append(s1);	
		return sb.toString();
    }
}

//Time: O(nlog(n))
//Space: O(n)
//Difficulty: medium