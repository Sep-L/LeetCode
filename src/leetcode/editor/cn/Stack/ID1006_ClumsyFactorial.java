package leetcode.editor.cn.Stack;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-02-27 05:25:23
 */
 
//Java：笨阶乘
public class ID1006_ClumsyFactorial{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int clumsy(int n) {
        int ans = -1;
        if (n == 3) {
            return 6;
        }
        if (n < 3) {
            return n;
        }
        ans = n * (n - 1) / (n - 2) + (n - 3);
        n -= 4;
        while (n >= 4) {
            ans -= n * (n - 1) / (n - 2) - (n - 3);
            n -= 4;
        }
        return ans - clumsy(n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.clumsy(4));
    }
}