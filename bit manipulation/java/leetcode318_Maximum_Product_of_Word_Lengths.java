//Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
//
//Example 1:
//
//Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
//Output: 16 
//Explanation: The two words can be "abcw", "xtfn".
//Example 2:
//
//Input: ["a","ab","abc","d","cd","bcd","abcd"]
//Output: 4 
//Explanation: The two words can be "ab", "cd".
//Example 3:
//
//Input: ["a","aa","aaa","aaaa"]
//Output: 0 
//Explanation: No such pair of words.

package wenxinjie3;

public class leetcode318_Maximum_Product_of_Word_Lengths {
    public int maxProduct(String[] words) {
        if (words == null || words.length == 0) return 0;
        int n = words.length;
        int[] value = new int[n];
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < words[i].length(); j++){
                value[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int res = 0;
        for (int i = 0; i < n; i ++){
            for(int j = 0; j < i; j ++){
                if ( (value[i] & value[j]) == 0){
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
}
