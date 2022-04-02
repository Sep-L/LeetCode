package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:14:58
 */
 
//Java：十进制整数的反码
public class ID1009_ComplementOfBase10Integer{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        int index = 0;
        while (n > 0) {
            ans |= (1 - n & 1) << index;
            n >>= 1;
            index++;
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