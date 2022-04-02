package leetcode.editor.cn.bitoperation.simple;

import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 17:48:27
 */
 
//Java：最大数值
public class 面试题16_07_MaximumLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximum(int a, int b) {
        long numa = a, numb = b;
        // 因为负数最高位是 -1, 右移 63 位就是 -1, negative 取值 0 或者 1
        int negative = (int) (1 + ((numa - numb) >> 63));
        // x * a + (1 - x) * b: x = 1 返回 a, x = 0 返回 b
        // negative 就是 x, negative = 0 -> a < b -> return b
        return negative * a + (1 - negative) * b;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}