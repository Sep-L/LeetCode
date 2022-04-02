package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 19:47:07
 */
 
//Java：4的幂
public class ID342_PowerOfFour{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfFour(int n) {
        int res = 0b1010101010101010101010101010101;
        return n > 0 && (n & (n - 1)) == 0 && (n & res) > 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(1));
    }
}