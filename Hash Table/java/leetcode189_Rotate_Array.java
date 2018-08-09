//
//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
//Example 1:
//
//Input: [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]

package wenxinjie2;

public class leetcode189_Rotate_Array {
    public void rotate(int[] nums, int k) {      
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
}

public void reverse(int[] nums, int i, int j){
    while (i < j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
        i++; j--;
    }
}
}

//Time: O(k)
//Space: O(k)
//Difficulty: medium   