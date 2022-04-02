package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-01 22:18:00
 */
 
//Java：不用加减乘除做加法
public class 剑指Offer65_BuYongJiaJianChengChuZuoJiaFaLcof{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
        /*
        a: 101100, b: 101001, a, b 分别保存不进位和进位的结果
        a ^ b: 得到在不考虑进位时的结果: 000101
        a & b: 得到需要进位的结果: 101000, 再进位即是左移一位
        用十进制来说明: a = 1651, b = 1654;
        a = 2205, b = 0110 << 1 = 1100;
        a = 3305, b = 0;
        */
        // b ！= 0 说明还有进位没有计算
        while (b != 0) {
            // 保存进位
            int carry = (a & b) << 1;
            // 无进位结果
            a = a ^ b;
            // 进位保留到下次计算
            b = carry;
        }

        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}