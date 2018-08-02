//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//
//Example 1:
//
//Given nums = [1,1,2],
//
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//
//It doesn't matter what you leave beyond the returned length.

package wenxinjie;

public class leetcode26_Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 1, repeat = 0;
        while (i < nums.length){
            if(nums[i] == nums[i-1]){
                repeat++;               
            }
            nums[i - repeat] = nums[i];
            i++;
        }       
        return nums.length - repeat;        
    }   	
}


//Time: O(n)
//Space: O(1)
//Difficulty: easy