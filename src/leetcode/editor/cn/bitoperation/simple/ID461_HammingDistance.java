package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-03-30 20:34:39
 */
 
//Java：汉明距离
public class ID461_HammingDistance{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        while (x > 0 || y > 0) {
            ans += (x & 1) ^ (y & 1);
            x >>= 1;
            y >>= 1;
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