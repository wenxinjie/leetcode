//Write a function that takes a string as input and reverse only the vowels of a string.
//
//Example 1:
//
//Input: "hello"
//Output: "holle"
//Example 2:
//
//Input: "leetcode"
//Output: "leotcede"

package wenxinjie3;

public class leetcode345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        String pool = "aeiouAEIOU";
        char[] ans = s.toCharArray();
        int i = 0, j = ans.length - 1;
        while (i < j){
            while (i < j && !pool.contains(ans[i] + "")) i ++;
            while (i < j && !pool.contains(ans[j] + "")) j --;
            char tem = ans[i];
            ans[i] = ans[j];
            ans[j] = tem;
            i ++;
            j --;
        }
        return new String(ans);
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy
