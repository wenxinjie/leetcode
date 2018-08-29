//Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]....
//
//Example 1:
//
//Input: nums = [1, 5, 1, 1, 6, 4]
//Output: One possible answer is [1, 4, 1, 5, 1, 6].
//Example 2:
//
//Input: nums = [1, 3, 2, 2, 3, 1]
//Output: One possible answer is [2, 3, 1, 3, 1, 2].


package wenxinjie3;

import java.util.Arrays;

public class leetcode324_Wiggle_Sort_II {
	   public void wiggleSort(int[] nums) {
	        int median = findKthLargest(nums, (nums.length) / 2);
	        int n = nums.length;

	        int left = 0, i = 0, right = n - 1;

	        while (i <= right) {

	            if (nums[newIndex(i,n)] > median) {
	                swap(nums, newIndex(left++,n), newIndex(i++,n));
	            }
	            else if (nums[newIndex(i,n)] < median) {
	                swap(nums, newIndex(right--,n), newIndex(i,n));
	            }
	            else {
	                i++;
	            }
	        }


	    }

	    private int findKthLargest(int[] nums, int i) {
		Arrays.sort(nums);
		
		return nums[i];
	}

		private void swap(int[] nums, int newIndex, int newIndex2) {
	    	int tem = nums[newIndex];
	    	nums[newIndex] = nums[newIndex2];
	    	nums[tem] = nums[newIndex2];	
	}

		private int newIndex(int index, int n) {
	        return (1 + 2*index) % (n | 1);
	    }
}

//
//Time: O(nlog(n))
//Space: O(1)
//Difficulty: medium