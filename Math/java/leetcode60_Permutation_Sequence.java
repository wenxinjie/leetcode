//The set [1,2,3,...,n] contains a total of n! unique permutations.
//
//By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
//
//"123"
//"132"
//"213"
//"231"
//"312"
//"321"
//Given n and k, return the kth permutation sequence.

package wenxinjie;

import java.util.ArrayList;
import java.util.List;

public class leetcode60_Permutation_Sequence {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=n; i++) numbers.add(i);
        
        k--;
    
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n-i];
            k = k % factorial[n-i];
            // sb.append(String.valueOf(numbers.get(index)));
            sb.append(numbers.get(index));
            numbers.remove(index);
        }    
        // return String.valueOf(sb);     
        return sb.toString();
    }
}

//Time: O(n)
//Space: O(1)
//Difficulty: medium