package leetcode.editor.cn.GreedyAlgorithm;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-25 01:13:19
 */
 
//Java：整数替换
public class ID397_IntegerReplacement{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int integerReplacement(int n) {
        int ans = 0;
        while (n > 3) {
            if ((n & 1) == 0) {
                // 偶数减半
                n >>= 1;
                ans++;
            } else {
                //奇数
                if ((n & 3) == 1) {
                    // xxx01: -1 接下来可以直接连续右移两次
                    // (n - 1) / 2 等效直接右移一位
                    n >>= 1;
                } else {
                    // xxx11: +1 接下来可以直接连续右移两次
                    // (n + 1) / 2 等效右移再 +1
                    n = n / 2 + 1;
                }
                // 奇数都是两次操作
                ans += 2;
            }
        }
        // n = 1, 2, 3 需要再替换 0, 1, 2 次
        ans += n - 1;
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