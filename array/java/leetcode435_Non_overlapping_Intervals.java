//Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
//
//Note:
//You may assume the interval's end point is always bigger than its start point.
//Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
//Example 1:
//Input: [ [1,2], [2,3], [3,4], [1,3] ]
//
//Output: 1
//
//Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.
//
//Definition for an interval.
//class Interval:
//    def __init__(self, s=0, e=0):
//        self.start = s
//        self.end = e

package wenxinjie4;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode435_Non_overlapping_Intervals {
    public int eraseOverlapIntervals(Interval[] intervals) {       
        if (intervals.length == 0)  return 0;
        Arrays.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return a.end - b.end;
            }});
        int end = intervals[0].end;
        int count = 1;        

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length - count;   
    }
}


//Time: O(nlog(n))
//Space: O(n)
//Difficulty: medium 