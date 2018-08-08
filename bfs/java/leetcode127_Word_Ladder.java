//iven two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:
//
//Only one letter can be changed at a time.
//Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
//Note:
//
//Return 0 if there is no such transformation sequence.
//All words have the same length.
//All words contain only lowercase alphabetic characters.
//You may assume no duplicates in the word list.
//You may assume beginWord and endWord are non-empty and are not the same.
//Example 1:
//
//Input:
//beginWord = "hit",
//endWord = "cog",
//wordList = ["hot","dot","dog","lot","log","cog"]
//
//Output: 5
//
//Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
//return its length 5.

package wenxinjie2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode127_Word_Ladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    Set<String> reached = new HashSet<String>();  
    Set<String> wordDict = new HashSet<String>(wordList);  
    if(!wordDict.contains(endWord)){
        return 0;
    }
    reached.add(beginWord);   
    int distance = 1;   
    while (!reached.contains(endWord)) {
        Set<String> toAdd = new HashSet<String>();
        for (String each : reached) {
            for (int i = 0; i < each.length(); i++) {
                char[] chars = each.toCharArray();
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    chars[i] = ch;
                    String word = new String(chars);
                    if (wordDict.contains(word)) {
                        toAdd.add(word);
                        wordDict.remove(word);
                    }
                }
            }
        }
        distance++;
        if (toAdd.size() == 0) return 0;
        reached = toAdd;
    }
    return distance;
    }
}

//Time: O(m + n)
//Space: O(n)
//Difficulty: medium