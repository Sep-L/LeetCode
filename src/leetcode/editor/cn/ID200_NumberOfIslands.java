package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-13 08:09:47
 */
 
//Java：岛屿数量
public class ID200_NumberOfIslands{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private char[][] grid;
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    ans++;
                    dfs(i ,j);
                }
            }
        }
        return ans;
    }

    private void dfs(int x, int y) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] == '0') {
            return;
        }
        grid[x][y] = '0';
        dfs(x - 1, y);
        dfs(x + 1, y);
        dfs(x, y - 1);
        dfs(x, y + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}