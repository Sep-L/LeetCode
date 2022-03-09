package leetcode.editor.cn;

import java.util.Stack;

/**
 * @author LQZ
 * @date 2022-02-26 21:05:23
 */
 
//Java：股票价格跨度
public class ID901_OnlineStockSpan{
    //leetcode submit region begin(Prohibit modification and deletion)
class StockSpanner {
    private Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int[] stock = new int[2];
        stock[0] = price;
        int res = 1;
        if (stack.isEmpty()) {
            stock[1] = res;
        } else {
            while (!stack.isEmpty() && price >= stack.peek()[0]) {
                res += stack.pop()[1];
            }
            stock[1] = res;
        }
        stack.push(stock);
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//leetcode submit region end(Prohibit modification and deletion)

}