//
//All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
//
//Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
//
//Example:
//
//Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//
//Output: ["AAAAACCCCC", "CCCCCAAAAA"]

package wenxinjie2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode187_Repeated_DNA_Sequences {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> res = new HashSet<String>();
        HashSet<String> store = new HashSet<String>();
        for (int i = 0; i < s.length() - 9; i++){
            if (store.contains(s.substring(i,i+10))) res.add(s.substring(i,i+10));
            else store.add(s.substring(i,i+10));
        }
        return new ArrayList<String>(res);
    }	
}
//
//Time: O(n)
//Space: O(n^2)
//Difficulty: medium       