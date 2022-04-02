package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 17:44:29
 */
 
//Java：配对交换
public class 面试题05_07_ExchangeLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int exchangeBits(int num) {
        int odd = 0x55555555;
        int even = 0xaaaaaaaa;
        return ((num & odd) << 1) | ((num & even) >> 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}