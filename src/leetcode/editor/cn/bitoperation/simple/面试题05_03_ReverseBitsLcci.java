package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 17:26:33
 */
 
//Java：翻转数位
public class 面试题05_03_ReverseBitsLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverseBits(int num) {
        int pre = 0, cur = 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                cur++;
            } else {
                // pre记录遇到 0 之前 1 的个数
                pre = cur;
                // cur 清 0 记录下一次连续 1 的个数
                cur = 0;
            }
            ans = Math.max(pre + cur + 1, ans);
            num >>= 1;
        }
        return ans == 33 ? 32 : ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.reverseBits(2147483646));
    }
}