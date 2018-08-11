//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
//Note: The algorithm should run in linear time and in O(1) space.
//
//Example 1:
//
//Input: [3,2,3]
//Output: [3]
//Example 2:
//
//Input: [1,1,1,3,3,2,2,2]
//Output: [1,2]

package wenxinjie2;

import java.util.ArrayList;
import java.util.List;

public class leetcode229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (nums.length==0) return res;               
        int cnt1 = 0, cnt2 = 0, n1 = 0, n2 = 1;            
        for (int num : nums) {
        	if (n1 == num)
        		cnt1++;
        	else if (n2 == num)
        		cnt2++;
        	else if (cnt1==0) {
        		n1 = num;
        		cnt1 = 1;
        	} else if (cnt2 == 0) {
        		n2 = num;
        		cnt2 = 1;
        	} else {
        		cnt1--;
                cnt2--;
        	}
        }
        cnt1 = 0; cnt2 = 0;     
        for (int num : nums) {
    	if (num == n1) cnt1++;
    	else if (num == n2) cnt2++;
    }
        
    if(cnt1 > nums.length/3) res.add(n1);
    if(cnt2 > nums.length/3) res.add(n2);
    return res;       
    }
	
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium