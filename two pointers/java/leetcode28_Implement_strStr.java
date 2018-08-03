//Implement strStr().
//
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//Example 1:
//
//Input: haystack = "hello", needle = "ll"
//Output: 2
//Example 2:
//
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1

package wenxinjie;

public class leetcode28_Implement_strStr {	
	public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        int i = 0, j = 0, label = 0;
        while (i < haystack.length() && j < needle.length()){
            if (haystack.charAt(i) == needle.charAt(j)){
                if(j == 0) label = i;
                j++; i++;
            }
            else{
                if (j != 0){
                    i = label;
                }
                j = 0;
                i ++;
            }
        }
        if (j < needle.length()) return -1;
        else return i - j;
    }
}


//Time: O(n^2)
//Space: O(1)
//Difficulty: easy