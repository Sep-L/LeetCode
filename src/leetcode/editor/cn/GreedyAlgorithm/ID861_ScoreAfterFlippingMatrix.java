package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-26 20:55:46
 */
 
//Java：翻转矩阵后的得分
public class ID861_ScoreAfterFlippingMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 首列全为 1, ans 按照列来计算, 不考虑 j = 0
        int ans = (1 << (n - 1)) * m;
        for (int j = 1; j < n; j++) {
            // 当前列 1 的个数
            int count = 0;
            // 数每列 1 的个数
            for (int[] rows : grid) {
                // 首列为 0, 反转过
                if (rows[0] == 0) {
                    count += 1 - rows[j];
                } else {
                    count += rows[j];
                }
            }
            int res = Math.max(count, m - count);
            ans += (1 << (n - j - 1)) * res;
            // System.out.println(res);
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