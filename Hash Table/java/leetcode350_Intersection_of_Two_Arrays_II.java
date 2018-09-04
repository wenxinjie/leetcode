//Given two arrays, write a function to compute their intersection.
//
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9]

package wenxinjie3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode350_Intersection_of_Two_Arrays_II {
	class Solution {
	    public int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        List<Integer> res = new ArrayList<Integer>();
	        for (int i = 0; i < nums1.length; i++){
	            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
	        }
	        
	        for (int i = 0; i < nums2.length; i++){
	            if (map.containsKey(nums2[i]) && (map.get(nums2[i]) > 0)){
	                res.add(nums2[i]);
	                map.put(nums2[i], map.get(nums2[i]) - 1);
	            }
	        }
	        
	        int[] ans = new int[res.size()];
	        for (int i = 0; i < ans.length; i++){
	            ans[i] = res.get(i);
	        }
	        return ans;       
	    }
	}
}


//Time: O(n)
//Space: O(n)
//Difficulty: easy