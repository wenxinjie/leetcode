//Given a pattern and a string str, find if str follows the same pattern.
//
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//Example 1:
//
//Input: pattern = "abba", str = "dog cat cat dog"
//Output: true
//Example 2:
//
//Input:pattern = "abba", str = "dog cat cat fish"
//Output: false
//Example 3:
//
//Input: pattern = "aaaa", str = "dog cat cat dog"
//Output: false

package wenxinjie3;

import java.util.HashMap;

public class leetcode290_Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        if (str.length() == 0) return false;
        HashMap<Character, String> map = new  HashMap<Character, String>();
        String[] pool = str.split(" ");
        if (pattern.length() != pool.length) return false;
        
        for (int i = 0; i < pool.length; i++){
            if (map.containsKey(pattern.charAt(i))){
                if (!map.get(pattern.charAt(i)).equals(pool[i])) return false;
            }
            else{
                if (map.containsValue(pool[i])) return false;
                else{
                    map.put(pattern.charAt(i), pool[i]);
                }
            }
        }
        return true;        
    }
	
}

//Time: O(n)
//Space: O(n)
//Difficulty: easy 