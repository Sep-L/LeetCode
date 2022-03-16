package leetcode.editor.cn.UnionFind_in;

import leetcode.editor.cn.custom.ToArray;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 06:09:50
 */
 
//Java：飞地的数量
public class ID1020_NumberOfEnclaves{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] parent;
    private int rows;
    private int cols;


    public int numEnclaves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int sum = rows * cols;
        parent = new int[sum + 1];
        for (int i = 0; i < sum + 1; i++) {
            parent[i] = i;
        }
        int[][] dfs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                        union(getIndex(i, j), sum);
                    } else {
                        for (int k = 0; k < 4; k++) {
                            int x = i + dfs[k][0];
                            int y = j + dfs[k][1];
                            if (grid[x][y] == 1) {
                                union(getIndex(i, j), getIndex(x, y));
                            }
                        }
                    }
                }
            }
        }

        int count = 0;
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (grid[i][j] == 1 && find(getIndex(i, j)) != sum) {
                    count++;
                }
            }
        }
        return count;
    }

    private int getIndex(int x, int y) {
        return x * cols + y;
    }

    private int find(int val) {
        if (val != parent[val]) {
            val = find(parent[val]);
        }
        return val;
    }

    private void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x > y) {
            parent[y] = x;
        } else if (x < y) {
            parent[x] = y;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String s = "[[0,0,0,1,1,1,0,1,0,0],[1,1,0,0,0,1,0,1,1,1],[0,0,0,1,1,1,0,1,0,0],[0,1,1,0,0,0,1,0,1,0],[0,1,1,1,1,1,0,0,1,0],[0,0,1,0,1,1,1,1,0,1],[0,1,1,0,0,0,1,1,1,1],[0,0,1,0,0,1,0,1,0,1],[1,0,1,0,1,1,0,0,0,0],[0,0,0,0,1,1,0,0,0,1]]";
        int[][] grid = ToArray.two(s);
    
        Solution solution = new Solution();
        System.out.println(solution.numEnclaves(grid));
    }
}