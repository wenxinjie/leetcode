//
//Given two strings s and t , write a function to determine if t is an anagram of s.
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false


package wenxinjie2;

public class leetcode242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())  return false;
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) 
            num[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            num[t.charAt(i) - 'a']--;
        for (int i : num) {
             if (i != 0) 
                 return false;
        }           
        return true;   
    }
	
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy