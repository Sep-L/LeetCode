package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 18:03:46
 */
 
//Java：不用加号的加法
public class 面试题17_01_AddWithoutPlusLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a ^= b;
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