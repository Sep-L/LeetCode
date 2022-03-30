package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 19:58:35
 */
 
//Java：玩筹码
public class ID1217_MinimumCostToMoveChipsToTheSamePosition{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int index : position) {
            if ((index & 1) == 1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(even, odd);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}