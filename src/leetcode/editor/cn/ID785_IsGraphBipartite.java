package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-13 14:09:14
 */
 
//Java：判断二分图
public class ID785_IsGraphBipartite{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] parent;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < n; i++) {
            int[] res = graph[i];
            if (res.length == 0) {
                continue;
            }
            int firstNum = res[0];
            for (int j = 0; j < res.length; j++) {
                if (find(res[j]) == find(i)) {
                    return false;
                }
                if (j >= 1) {
                    // 执行耗时:2 ms,击败了19.66% 的Java用户
                    // 内存消耗:41.9 MB,击败了37.12% 的Java用户
                    union(res[j], firstNum);
                    // 执行耗时:5 ms,击败了7.16% 的Java用户
                    // 内存消耗:42.2 MB,击败了20.26% 的Java用户
                    // union(firstNum, res[j]);
                }
            }
        }
        return true;
    }

    private int find(int val) {
        while (val != parent[val]) {
            val = parent[val];
        }
        return val;
    }

    private void union(int a, int b) {
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