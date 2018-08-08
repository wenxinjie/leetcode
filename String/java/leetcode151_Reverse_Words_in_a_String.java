//
//Given an input string, reverse the string word by word.
//
//Example:  
//
//Input: "the sky is blue",
//Output: "blue is sky the".
//Note:
//
//A word is defined as a sequence of non-space characters.
//Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
//You need to reduce multiple spaces between two words to a single space in the reversed string.

package wenxinjie2;

public class leetcode151_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        String[] pool = s.trim().split("\\s+");
        String res = "";
        for (String s1:pool){
            res = " " + s1 + res;
        }
        return res.trim();
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium
