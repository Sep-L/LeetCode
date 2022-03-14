package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-13 09:17:07
 */
 
//Java：省份数量
public class ID547_NumberOfProvinces{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Union union = new Union(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    union.union(i, j);
                }
            }
        }
        return union.getCount();
    }
}

class Union {

    private int[] parent;
    private int count;

    public Union(int size) {
        count = size;
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
        int root_a = find(a);
        int root_b = find(b);
        if (root_a != root_b) {
            parent[root_a] = root_b;
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
        int[][] isConnected = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
    
        Solution solution = new Solution();
        System.out.println(solution.findCircleNum(isConnected));
    }
}