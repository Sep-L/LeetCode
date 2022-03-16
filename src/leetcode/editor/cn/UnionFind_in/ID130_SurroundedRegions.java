package leetcode.editor.cn.UnionFind_in;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-09 11:09:50
 */
 
//Java：被围绕的区域
public class ID130_SurroundedRegions{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        if (rows == 0) return;
        int cols = board[0].length;
        int sum = rows * cols;
        int[][] dfs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Union union = new Union(sum);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    // 把所有的 O 分成两组, 边界的 O 全部和 sum 位置连接, 剩余的连在一起
                    if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                        union.union(i * cols + j, sum);
                    } else {
                        for (int k = 0; k < 4; k++) {
                            int x = i + dfs[k][0];
                            int y = j + dfs[k][1];
                            if (board[x][y] == 'O') {
                                // 执行耗时:4 ms,击败了19.89% 的Java用户
                                // 内存消耗:43.6 MB,击败了11.73% 的Java用户
                                // 用时短的原因猜测: 把四周的节点指向 [i, j] 避免值被重复修改
                                union.union(x * cols + y, i * cols + j);
                                // 执行耗时:1440 ms,击败了5.74% 的Java用户
                                // 内存消耗:43.7 MB,击败了9.87% 的Java用户
                                // union.union(i * cols + j, x * cols + y);
                            }
                        }
                    }
                }

            }
        }
        // System.out.println(Arrays.toString(union.parent));

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                // 不和 sum 连通, 说明不在边界
                if (board[i][j] == 'O' && !union.isConnect(i * cols + j, sum)) {
                    board[i][j] = 'X';
                }
            }
        }
    }
}

class Union {
    public int[] parent;

    public Union(int size) {
        parent = new int[size + 1];
        for (int i = 0; i <= size; i++) {
            parent[i] = i;
        }
    }

    public int find(int num) {
        while (num != parent[num]) {
            num = parent[num];
        }
        return parent[num];
    }

    public boolean isConnect(int a, int b) {
        return find(a) == find(b);
    }

    public void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x != y) {
            parent[x] = y;
        }
    }
}

//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}