package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:28:22
 */
 
//Java：数组异或操作
public class ID1486_XorOperationInAnArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        while (n > 0) {
            ans ^= start;
            start += 2;
            n--;
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