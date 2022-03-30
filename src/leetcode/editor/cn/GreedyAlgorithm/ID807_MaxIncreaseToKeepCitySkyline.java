package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-26 15:33:19
 */
 
//Java：保持城市天际线
public class ID807_MaxIncreaseToKeepCitySkyline{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            int rMax = 0, cMax = 0;
            for (int j = 0; j < n; j++) {
                rMax = Math.max(rMax, grid[i][j]);
                cMax = Math.max(cMax, grid[j][i]);
            }
            rowMax[i] = rMax;
            colMax[i] = cMax;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int high = Math.min(rowMax[i], colMax[j]);
                if (grid[i][j] < high) {
                    ans += high - grid[i][j];
                }
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