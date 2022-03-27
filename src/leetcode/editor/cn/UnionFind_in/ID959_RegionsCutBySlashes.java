package leetcode.editor.cn.UnionFind_in;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-14 21:51:52
 */
 
//Java：由斜杠划分区域
public class ID959_RegionsCutBySlashes{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] parent;
    private int n;
    private int count;


    public int regionsBySlashes(String[] grid) {
        n = grid.length;
        // n * n 的图, 节点个数一共 (n + 1) * (n + 1) 个
        parent = new int[(n + 1) * (n + 1)];
        for (int i = 0; i < (n + 1) * (n + 1); i++) {
            parent[i] = i;
        }
        // 连接边界
        boundaryConnection();
        // 连接斜线
        for (int i = 0; i < n; i++) {
            stringLine(i, grid[i]);
        }
        return count;
    }

    // 将边界上的点与 0 节点连通, 注意 0 不能是父节点, 最终让所有边界指向右下点
    private void boundaryConnection() {
        // 转化为点, 每个点坐标(x, y) 对应 point = x + y * (n + 1)
        for (int i = 1; i < n + 1; i++) {
            // 第 0 行确定 y = 0, point = x
            union(0, i);
            // 第 0 列确定 x = 0, point = y * (n + 1)
            union(0, i * (n + 1));
            // 最后一行确定 y = n, point = x + n * (n + 1)
            union(n * (n + 1), n * (n + 1) + i);
            // 最后一列确定 x = n, point = n + y * (n + 1)
            union(n, n + (n + 1) * i);
        }
    }

    // 处理每组斜线
    private void stringLine(int y, String s) {
        int point = y * (n + 1);
        for (int x = 0; x < n; x++) {
            char c = s.charAt(x);
            if (c == '/') {
                // 连接左下和右上 point = x + y * (n + 1)
                // 右上是当前节点 (x + 1, y) 左下 (x, y + 1)
                union(x + 1 + y * (n + 1), x + (y + 1) * (n + 1));
            } else if (c == '\\') {
                // 连接左上和右下 point = x + y * (n + 1)
                // 左上 (x, y) 右下 (x + 1, y + 1)
                union(x + y * (n + 1), x + 1 + (y + 1) * (n + 1));
            }
        }
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
        if (x != y) {
            parent[x] = y;
        } else {
            count++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        String[] grid = new String[]{"/\\","\\/"};
    
        Solution solution = new Solution();
        System.out.println(solution.regionsBySlashes(grid));
    }
}