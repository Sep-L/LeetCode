package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 15:25:36
 */
 
//Java：交替位二进制数
public class ID693_BinaryNumberWithAlternatingBits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n >>= 1;
        while (n > 0) {
            int cur = n & 1;
            if (prev == cur) {
                return false;
            }
            prev = cur;
            n >>= 1;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}