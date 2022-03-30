package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-25 01:36:19
 */
 
//Java：无重叠区间
public class ID435_NonOverlappingIntervals{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ans = 0, i = 0;
        while (i < intervals.length) {
            int end = intervals[i][1];
            i++;
            while (i < intervals.length && intervals[i][0] < end) {
                i++;
                ans++;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}