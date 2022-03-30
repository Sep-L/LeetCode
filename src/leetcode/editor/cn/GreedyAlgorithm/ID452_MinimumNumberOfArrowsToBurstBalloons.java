package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LQZ
 * @date 2022-03-25 01:55:24
 */
 
//Java：用最少数量的箭引爆气球
public class ID452_MinimumNumberOfArrowsToBurstBalloons{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // System.out.println(o1[1] - o2[1]);
                return Integer.compare(o1[1], o2[1]);
            }
        });
        // System.out.println(Arrays.deepToString(points));
        int ans = 1;
        int axis = points[0][1];
        for(int i = 1; i < points.length; i++) {
            // 坐标小于下个气球的起点, 需要新用一支箭
            if (axis < points[i][0]) {
                ans++;
                axis = points[i][1];
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