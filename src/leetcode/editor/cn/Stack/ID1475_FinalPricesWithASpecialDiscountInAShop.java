package leetcode.editor.cn.Stack;
import org.junit.Test;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-22 15:04:20
 */
 
//Java：商品折扣后的最终价格
public class ID1475_FinalPricesWithASpecialDiscountInAShop{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                int index = stack.pop();
                prices[index] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}