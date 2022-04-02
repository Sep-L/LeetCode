package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 17:22:26
 */
 
//Java：颠倒二进制位
public class ID190_ReverseBits{
    //leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res |= (n & 1) << (31 - i);
            n >>= 1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}