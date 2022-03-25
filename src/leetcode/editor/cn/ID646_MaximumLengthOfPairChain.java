package leetcode.editor.cn;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-25 03:50:33
 */
 
//Java：最长数对链
public class ID646_MaximumLengthOfPairChain{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        System.out.println(Arrays.deepToString(pairs));
        int end = pairs[0][1];
        int ans = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > end) {
                ans++;
                end = pairs[i][1];
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