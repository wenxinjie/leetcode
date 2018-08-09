//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.
//
//Example 1:
//
//Input: [3,2,3]
//Output: 3
//Example 2:
//
//Input: [2,2,1,1,1,2,2]
//Output: 2

package wenxinjie2;

public class leetcode169_Majority_Element {
    public int majorityElement(int[] nums) {
        int cur=nums[0], cnt = 1;
        for(int i=1; i<nums.length;i++){
            if(cnt==0){            
                cur=nums[i];
            }
            if(cur==nums[i]){
                cnt++;
            }else cnt--;
            
        }
        return cur;
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy