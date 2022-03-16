package leetcode.editor.cn.UnionFind_in;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-14 20:17:29
 */
 
//Java：可能的二分法
public class ID886_PossibleBipartition{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private int[] parent;

    public boolean possibleBipartition(int n, int[][] dislikes) {
        parent = new int[2 * n + 1];
        // 敌人的敌人是朋友, 开二倍空间大小的并查集, 前半朋友集后半敌人集
        // 相互为朋友的两个人, 会间接的通过后半部分某个敌人连接在一起放在前半部分
        // 举例 a, b, c, a c 有共同的敌人 b
        // 那么它们会通过 (b + n) 这同一个敌人连在一起
        for (int i = 0; i < 2 * n + 1; i++) {
            parent[i] = i;
        }
        for (int[] dislike : dislikes) {
            int friend = dislike[0];
            int enemy = dislike[1];

            int friendGroup = find(friend);
            int enemyGroup = find(enemy);

            if (friendGroup == enemyGroup) {
                return false;
            }
            union(enemy + n, friendGroup);
            union(friend + n, enemyGroup);
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
        int n = 4;
        int[][] dislikes = new int[][]{{1, 2}, {1, 3}, {2, 4}};
    
        Solution solution = new Solution();
        System.out.println(solution.possibleBipartition(n, dislikes));
    }
}