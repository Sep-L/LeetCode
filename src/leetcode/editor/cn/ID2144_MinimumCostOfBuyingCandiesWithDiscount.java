package leetcode.editor.cn;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author LQZ
 * @date 2022-03-16 21:36:22
 */
 
//Java：打折购买糖果的最小开销
public class ID2144_MinimumCostOfBuyingCandiesWithDiscount{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int index = n - 1;
        int ans = 0;
        while (index > 1) {
            ans += cost[index--];
            ans += cost[index--];
            index--;
        }
        while (index >= 0) {
            ans += cost[index];
            index--;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}