package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-13 09:43:53
 */

//Java：冗余连接
public class ID684_RedundantConnection {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            Union union = new Union(n + 1);
            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];
                if (union.isConnect(a, b)) {
                    return edge;
                }
                union.union(a, b);
            }
            return null;
        }

        class Union {

            private int[] parent;

            public Union(int size) {
                parent = new int[size];
                for (int i = 0; i < size; i++) {
                    parent[i] = i;
                }
            }

            public int find(int a) {
                while (a != parent[a]) {
                    a = parent[a];
                }
                return a;
            }

            public boolean isConnect(int a, int b) {
                return find(a) == find(b);
            }

            public void union(int a, int b) {
                int rootA = find(a);
                int rootB = find(b);
                if (rootA != rootB) {
                    parent[rootA] = rootB;
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[][] edges = new int[][]{{1,2}, {1,3}, {2,3}};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findRedundantConnection(edges)));
    }
}