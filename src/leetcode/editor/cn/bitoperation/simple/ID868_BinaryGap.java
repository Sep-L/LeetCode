package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-31 16:10:16
 */
 
//Java：二进制间距
public class ID868_BinaryGap{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        int start = 32, end;
        int index = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                end = index;
                ans = Math.max(ans, end - start);
                start = end;
            }
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