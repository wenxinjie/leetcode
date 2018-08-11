//
//Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//Example:
//
//Input:  [1,2,3,4]
//Output: [24,12,8,6]
//Note: Please solve it without division and in O(n).


package wenxinjie2;

public class leetcode238_Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] num1 = new int[n], num2 = new int[n];
        num1[0] = 1; num2[n-1]=1;
        for (int i = 1; i < n; i++){
            num1[i] = num1[i-1] * nums[i-1];
            num2[n-i-1] = num2[n-i] * nums[n-i]; 
        }
        for (int i = 0; i < n; i++){
            num1[i] = num1[i] * num2[i];
        }
        return num1;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium