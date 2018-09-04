//Write a function that takes a string as input and returns the string reversed.
//
//Example 1:
//
//Input: "hello"
//Output: "olleh"
//Example 2:
//
//Input: "A man, a plan, a canal: Panama"
//Output: "amanaP :lanac a ,nalp a ,nam A"

package wenxinjie3;

public class leetcode344_Reverse_String {
    public String reverseString(String s) {
        char[] ans = s.toCharArray();
        int len = ans.length;
        if (len == 0) return new String(ans);
        for (int i = 0; i < len / 2; i ++){
            char tem = ans[i];
            ans[i] = ans[len - i - 1];
            ans[len - i - 1] = tem;              
        }
        return new String(ans);
    }	
}


//Time: O(n)
//Space: O(n)
//Difficulty: easy