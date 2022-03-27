package leetcode.editor.cn.UnionFind_in;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LQZ
 * @date 2022-03-14 21:17:32
 */
 
//Java：移除最多的同行或同列石头
public class ID947_MostStonesRemovedWithSameRowOrColumn{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private Map<Integer, Integer> parent;
    private int count = 0;

    public int removeStones(int[][] stones) {
        parent = new HashMap<>();
        for (int[] stone : stones) {
            // 将横坐标 + 10001 来区分相同的横纵坐标
            union(stone[0] + 10001, stone[1]);
        }
        return stones.length - count;
    }

    private int find(int val) {
        if (!parent.containsKey(val)) {
            parent.put(val, val);
            // 新加入了单独的节点
            count++;
        }
        if (val != parent.get(val)) {
            parent.put(val, find(parent.get(val)));
        }
        return parent.get(val);
    }

    private void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if (x == y) {
            return;
        }
        parent.put(x, y);
        // 有两个连通了, 那么减少一个
        count--;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}