package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 07:32:59
 */
 
//Java：买卖股票的最佳时机含手续费
public class ID714_BestTimeToBuyAndSellStockWithTransactionFee{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int start = prices[0] + fee;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] + fee < start) {
                start = prices[i] + fee;
            } else if (prices[i] > start) {
                profit += prices[i] - start;
                start = prices[i];
            }

        }
        return profit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}