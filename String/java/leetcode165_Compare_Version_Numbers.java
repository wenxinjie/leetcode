//Compare two version numbers version1 and version2.
//If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
//
//You may assume that the version strings are non-empty and contain only digits and the . character.
//The . character does not represent a decimal point and is used to separate number sequences.
//For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
//
//Example 1:
//
//Input: version1 = "0.1", version2 = "1.1"
//Output: -1
//Example 2:
//
//Input: version1 = "1.0.1", version2 = "1"
//Output: 1
//Example 3:
//
//Input: version1 = "7.5.2.4", version2 = "7.5.3"
//Output: -1

package wenxinjie2;

public class leetcode165_Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len1 = v1.length, len2 = v2.length;
        int len = Math.max(len1, len2);
        for (int i = 0; i < len; i ++){
            Integer a = (i < len1)? Integer.parseInt(v1[i]): 0;
            Integer b = (i < len2)? Integer.parseInt(v2[i]): 0;
            int res = a.compareTo(b);
            if (res != 0) return res;
        }
        return 0;
    }
}

//
//Time: O(n)
//Space: O(1)
//Difficulty: medium