package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-18 14:23:31
 */

//Java：找出星型图的中心节点
public class ID1791_FindCenterOfStarGraph {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findCenter(int[][] edges) {
            int node1 = edges[0][0];
            int node2 = edges[0][1];

            if (node1 == edges[1][0] || node1 == edges[1][1]) {
                return node1;
            }
            return node2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}