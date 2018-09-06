//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements that appear twice in this array.
//
//Could you do it without extra space and in O(n) runtime?
//
//Example:
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[2,3]

package wenxinjie4;

import java.util.ArrayList;
import java.util.List;

public class leetcode442_Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        while ( i < nums.length){
            int j = nums[i] - 1;
            if (nums[i] != nums[j]){
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
            }
            else{
                i++;
            }
        }
        
        for (int j = 0; j < nums.length; j ++){
            if (j + 1 != nums[j]) res.add(nums[j]);
        }
        return res;
    }	
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium