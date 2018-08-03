//
//Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.
//
//Return the quotient after dividing dividend by divisor.
//
//The integer division should truncate toward zero.
//
//Example 1:
//
//Input: dividend = 10, divisor = 3
//Output: 3
//Example 2:
//
//Input: dividend = 7, divisor = -3
//Output: -2

package wenxinjie;


// be careful about data type
public class leetcode29_Divide_Two_Integers {
	public int divide(int dividend, int divisor) {
        int flag = -1;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
            flag = 1;
        }
        long dend= Math.abs((long)dividend), visor = Math.abs((long)divisor);
        long q = helper(dend, visor);
        if (q > Integer.MAX_VALUE){
            if(flag == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        else{
            if (flag == 1) 
                {return (int)q;}
            else 
                {return (int)(-q);}
        }        
    }
    
    public long helper(long dend, long visor){
        if (dend < visor){
            return 0;
        }
        long multi = 1, subtract = visor;
        while (subtract + subtract < dend){
            multi += multi;
            subtract += subtract;
        }
        return multi + helper(dend - subtract, visor);
    }
}


//Time: O(log(n))
//Space: O(1)
//Difficulty: medium