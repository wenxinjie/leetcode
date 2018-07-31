//Given a string, find the length of the longest substring without repeating characters.
//Examples:
//Given "abcabcbb", the answer is "abc", which the length is 3.
//Given "bbbbb", the answer is "b", with the length of 1.
//Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

package wenxinjie;

import java.util.HashMap;

public class leetcode3_Longest_Substring_Without_Repeating_Characters {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) return 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		int n = s.length();
		int start = 0;
		int res = 0;
		while (i < n) {
			if (map.containsKey(s.charAt(i))) {
				start = Math.max(start, map.get(s.charAt(i)) + 1);
			}
			map.put(s.charAt(i), i);
			res = Math.max(res, i - start + 1);
			i++;
		}
		return res;
	}
}

//time: O(n)
//space: O(n)
//difficulty: medium