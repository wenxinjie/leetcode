//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
//
//The replacement must be in-place and use only constant extra memory.
//
//Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
//
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1

package wenxinjie;

public class leetcode31_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n > 1){
            int i = n - 2;
            while (i >= 0 && nums[i] >= nums[i+1]){
                i--;
            }
            if (i>=0){
                swap(nums,i);
            }
            reverse(nums,i);
        }
    }
    
    public void swap(int[] nums, int i){
        int j = nums.length - 1;
        while (j > i && nums[j]<= nums[i]){
            j--;
        }
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
        return;
    }
    
    public void reverse(int[] nums, int i){
        int p1 = i+1, p2 = nums.length - 1;
        while (p1 < p2){
            int tem = nums[p1]; nums[p1] = nums[p2]; nums[p2] = tem;
            p1++; p2--;
        }
        return;
    }
}
//
//Time: O(nlogn)
//Space: O(1)
//Difficulty: medium