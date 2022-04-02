package leetcode.editor.cn.bitoperation.simple;
import org.junit.Test;

/**
 * @author LQZ
 * @date 2022-04-02 17:16:45
 */
 
//Java：插入
public class 面试题05_01_InsertIntoBitsLcci{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int insertBits(int N, int M, int i, int j) {
        int ans = 0;
        for (int k = 0; k < 32; k++) {
            if (k > j || k < i) {
                ans |= N & (1 << k);
                continue;
            }
            ans |= (M & 1) << k;
            M >>= 1;
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