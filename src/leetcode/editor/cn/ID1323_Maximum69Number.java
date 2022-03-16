package leetcode.editor.cn;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-16 20:04:25
 */
 
//Java：6 和 9 组成的最大数字
public class ID1323_Maximum69Number{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximum69Number (int num) {
        int base = 1000;
        int cur = num;
        while (cur > 0) {
            if (cur / base == 6) {
                num += 3 * base;
                return num;
            }
            if (cur / base > 0) {
                cur -= 9 * base;
            }
            base /= 10;
        }
        return num;
    }

    private boolean nine(int num) {
        return (num + 1) % 10 == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    @Test
    public void test() {
    
    
        Solution solution = new Solution();
        System.out.println();
    }
}