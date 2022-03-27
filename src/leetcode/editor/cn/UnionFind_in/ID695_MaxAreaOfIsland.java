package leetcode.editor.cn.UnionFind_in;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-13 10:01:25
 */
 
//Java：岛屿的最大面积
public class ID695_MaxAreaOfIsland{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[][] grid;
    private int rows;
    private int cols;
    private int ans = 0;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(ans, dfs(i, j));
                }
            }
        }
        return ans;
    }

    private int dfs(int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        return 1 + dfs(x - 1, y) + dfs(x + 1, y) + dfs(x, y - 1) + dfs(x, y + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}