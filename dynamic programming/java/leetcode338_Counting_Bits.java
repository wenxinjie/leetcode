//Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
//
//Example 1:
//
//Input: 2
//Output: [0,1,1]
//Example 2:
//
//Input: 5
//Output: [0,1,1,2,1,2]

package wenxinjie3;

public class leetcode338_Counting_Bits {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        if(num == 0) return res;   
        int index = 1;
        for (int i = 1; i < num + 1; i++){
            if (i == index){
                index *= 2;
                res[i] = 1;
            }
            else{
                res[i] = res[i % (index / 2)] + 1;
            }
        }
        return res;
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium