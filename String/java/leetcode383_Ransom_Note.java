//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//
//Each letter in the magazine string can only be used once in your ransom note.
//
//Note:
//You may assume that both strings contain only lowercase letters.
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

package wenxinjie4;

public class leetcode383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] pool = new char[26];
        for (int i = 0; i < magazine.length(); i ++){
            pool[magazine.charAt(i) - 'a'] ++;
        }
        
        for (int i = 0; i < ransomNote.length(); i ++){
            if (pool[ransomNote.charAt(i) - 'a'] <= 0) return false;
            pool[ransomNote.charAt(i) - 'a'] --;                
        }
        return true;
    }
}

//Time: O(n + m)
//Space: O(n + m)
//Difficulty: easy  
