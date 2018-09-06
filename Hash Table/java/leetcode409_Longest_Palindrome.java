//Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
//This is case sensitive, for example "Aa" is not considered a palindrome here.
//
//Note:
//Assume the length of given string will not exceed 1,010.
//
//Example:
//
//Input:
//"abccccdd"
//
//Output:
//7
//
//Explanation:
//One longest palindrome that can be built is "dccaccd", whose length is 7.


package wenxinjie4;

import java.util.HashMap;

public class leetcode409_Longest_Palindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int odd = 0;
        for ( char c: map.keySet()){
            int i = map.get(c);
            if (i % 2 == 1 ){
                res += i - 1;
                odd = 1;
            }
            else{
                res += i;
            }
        }
        return res + odd;
    }
}


//Time: O(n) 
//Space: O(n)
//Difficulty: easy