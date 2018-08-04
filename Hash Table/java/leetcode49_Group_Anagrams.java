//Given an array of strings, group anagrams together.
//
//Example:
//
//Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
//Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]

package wenxinjie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode49_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!map.containsKey(key))
            {map.put(key, new ArrayList<String>());}
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

//Time:O(n)
//Space: O(n)
//Difficulty: medium