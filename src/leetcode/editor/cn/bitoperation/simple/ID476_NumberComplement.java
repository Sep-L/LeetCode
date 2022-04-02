package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 20:37:19
 */
 
//Java：数字的补数
public class ID476_NumberComplement{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findComplement(int num) {
        int i = 0;
        int ans = 0;
        while (num > 0) {
            ans += (1 - num & 1) << i;
            num >>= 1;
            i++;
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